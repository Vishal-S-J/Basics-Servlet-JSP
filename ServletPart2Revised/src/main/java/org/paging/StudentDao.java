package org.paging;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private final Connection connection;

    public StudentDao(Connection connection) {
        this.connection = connection;
    }

    public List<Student> getRecords(int start, int total) {
        List<Student> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM STUDENT LIMIT " + (start - 1) + "," + total);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student();
                student.setStudentId(resultSet.getInt("STUDENT_ID"));
                student.setStudentFName(resultSet.getString("STUDENT_FNAME"));
                student.setStudentLName(resultSet.getString("STUDENT_LNAME"));
                student.setStudentGender(resultSet.getString("STUDENT_GENDER"));
                student.setStudentDOB(resultSet.getString("STUDENT_DOB"));
                student.setStudentCourseId(resultSet.getInt("STUDENT_CRS_ID"));
                list.add(student);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int countId() {
        int count = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM STUDENT");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
