package org.paging;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDao studentDao = new StudentDao(DBConnect.getConnection());

        int count = studentDao.countId();
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        String spageId = req.getParameter("page");
        int pageId = Integer.parseInt(spageId);
        int total = 10;
        int pages = count / total;
        if (pageId == 1) {

        } else {
            pageId = pageId - 1;
            pageId = pageId * total + 1;
        }
        List<Student> list = studentDao.getRecords(pageId, total);

        printWriter.print("<h1>Page No: " + spageId + "</h1>");
        printWriter.print("<table border='1' cellpadding='4' width='60%'>");
        printWriter.print("<tr><th>Student Id</th><th>Student First Name</th><th>Student Last Name</th><th>Student Gender</th><th>Student DOB</th><th>Course Id</th></tr>");
        for (Student student : list) {
            printWriter.print("<tr><td>" + student.getStudentId() + "</td><td>" + student.getStudentFName() + "</td><td>" + student.getStudentLName() + "</td><td>" + student.getStudentGender() + "</td><td>" + student.getStudentDOB() + "</td><td>" + student.getStudentCourseId() + "</td></tr>");
        }
        printWriter.print("</table>");

        for (int i = 1; i <= pages; i++) {
            printWriter.print("<a href='ViewServlet?page=" + i + "'>" + i + "</a> ");
        }
        printWriter.close();
    }
}
