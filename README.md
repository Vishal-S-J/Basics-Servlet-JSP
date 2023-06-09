# SERVLET
- Servlet is a technology which is used to create a web application.
- It is an API that provides many interfaces and classes including documentation.
- it is the server side applet.
- servlet is used at server side for request and response mapping.
---
- There are main 3 steps of life cycle for servlet
1. init()
2. service(req, resp)
3. destroy()
---
- Life Cycle of servlet
1. born
	- when client sends the request for the first time to the server. servlet is created
	- servlet can be created using 2 ways
		1. by using generic servlet
		2. by using http servlet class
	- and when we create servlet it eters the born state.

2. Loading
	- after creatubg the servlet it should be loaded at the server side abd apache tomcat us responsible for the loading the servlet at server side.
	
3. Initialize
	- after loading the servlet at server side it should be initalized using init()
	- init() is called only once throughout the life cycle of servlet.
	
4. Running
	- when servlet is in running state it can call service()
	- service() is used for actual request and response mapping and it can be called for each request of the client.
	
5. Stop/ Pause
	- before destroying the servlet it should enter in stop or pause state.
	
6. Dead
	- if servlet have finished its task or if it is no longer needed then it can enter dead state using destroy() it is called only one throughout the life cycle of servlet.
---
DIFFERENCE BETWEEN generic servlet and http servlet

| Generic servlet | Http Servlet |
|:----:|:-----:|
|generic servlet implements servlet interface|http servlet extends generic servlet|
|protocol independent|protocol specific|
|init, service, destroy, are lifecycle methods for generic servlet|init, service, destroy, doget(), dopost() are life cycle methods for Http Servlet|
|generic servlet doesnt support state management functionality|It supports state management functionality|

---
while creating the servlet there are 3 methods to be override service(), doGet(), doPost() methods
> - protected void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {}
> - protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}
> - protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}

---
setting the content type of html page
using `setContentType()` of Http servlet response i.e `response.setContentType("text/html")` other can also be used like `("text/mp3")`

---
PRINTWRITER
- To send the response from servlet to client we should estabilish writer stream and this writer stream can be created by using printwriter class
- Syntax:
```
PrintWriter pw = response.getWriter();
pw.println("MESSAGE");
```
fetch value from html file
- `getParameter()` is used to fetch value from the html file.
- `getParameterValues()` is used to fetch multiple values of the same parameter and it returns string array as follows
`String[] params = request.getParameterValues("params name");`
---
Request Dispatcher
- Sending data from one page to another
- `RequestDispatcher rd = request.getDispatcher("url");`
- This interface have 2 methods
1. void include(request, response)
```
client --> request --> servlet1 --> forward --> servlet2
   ^                       |                        |
   |                    response1               response2
   |                                                |
   |------------------------------------------------|
```
response of second servlet is sent to the client. Response of the first servlet is not displayed to the user.

2. void forward(request, response)
```
client --> request --> servlet1 --> include --> servlet2
   ^                       |    <-- response <--    |
   |------------------ response1                response2
```
response of second servlet is included in the response of the first servlet that is being sent to the client.

---
State Management or Session Management
Need of State management
- Http Servlet uses Http Protocol and it is stateless protocol.
- which means http protocol doesn't identify its client 
- and every time it considers the client as new client
- so to avoid this limitaion java has introduces the new concept of statemanagement
- it can be done in 4 types.
1. Cookies
- these are used to store the small amount of information
- to create cookies we can use cookies class as follows
`Cookies ck = new Cookies(name, value);`
- Cookies are created at server side and store at client side.
- to send cookies from server to client we can use add cookies() and its method of HttpServletResponse
`resp.addCookies(ck)`
- one client can have multiple cookies.
- to fetch cookies at client side we can use getCookies() of HttpServletRequest which returns
Cookies array
	`Cookies[] cook = resp.getCookies();`


| Methods of Cookies |
|:-----:|
|String getName()|
|String getValue()|
|int getMaxAge() - (in seconds value >0, <0, 0)|
|void setMaxAge(seconds)|

Types of Cookes-
1. Persistant -> cookies which remains after closing the browser are called persistent cookies it have age >0
2. Non-Persistant -> cookies which are immidiately flushed after closing the browser are called as non-persistent cookies and have age <0 i.e (-1)
- setMaxAge(1) -> data will be present even after closing the browser.
- setMaxAge(0) -> to delete cookies use age as 0.
- Now a days cookies are non-persistent cookies.
	
2. Http Session
- it is used to store lrge amount of information
- to create session we can use HttpSession interface as follows
	`HttpSession hs = req.getSession();`
- session is created and stoored at client side
- one client have only one session
- getSession method perform 2 tasks

		1. it creates new session if session not exist.
		2. it reopens the session if it already exist.
		
	|Methods of HttpSession|
	|:-------:|
	|void setAttribute(name, value)|
	|object getAttribute(name)|
	|Int getMaxInactiveInterval()|
	|void setMaxInactiveInterval(seconds)|
	
3. URL rewriting
- to store and send value to hyperlink we can use the concept of url rewritting as follows.
	`<a href="pagename?value=value">link</a>`and
	`String value = req.getParameter("value");`
	
4. Hidden fields
- hidden fields are nothing but hidden text fields which are used to hide values from the form as follows
- Syntax: `<input type = hidden name=name value = (setValue)>`

---
SERVLET FILTER
- these are used in preprocessing and post of request and response
- to create servlet filterwe can use filter interface.
- this filler interface contains 3 methods
	`init()`
	`dofilter()`
	`destroy()`
- and map filter with specific servlet we can use two tags
	`<filter>`
	`<filter-mapping>`
- actual login of filter is defined inside dofilter() it cotains 3 parts
	 - servlet request
	 - servlet response
	 - filter chain
- filter chain - to chain or to connect filter wiht specific servlet we can use filter chain and mapping for that filter chain is performed inside web.xml

---
SERVLET WITH ANNOTATIONS
|ANNOTATIONS|DESCRIPTION|
|:---|:---|
|@WebServlet|To declare a servlet|
|@WebInitParam|To specify an initialization parameter.|
|@WebFilter|To declare a servlet filter.|
|@WebListener|To declare a WebListener|
|@HandlesTypes|To declare the class types that a ServletContainerInitializer can handle.|
|@HttpConstraint|This annotation is used within the ServletSecurity annotation to represent the security constraints to be applied to all HTTP protocol methods for which a corresponding HttpMethodConstraint element does NOT occur within the ServletSecurity annotation.|	
|@HttpMethodConstraint|This annotation is used within the ServletSecurity annotation to represent security constraints on specific HTTP protocol messages.|
|@MultipartConfig|Annotation that may be specified on a Servlet class, indicating that instances of the Servlet expect requests that conform to the multipart/form-data MIME type.|	
|@ServletSecurity|This annotation is used on a Servlet implementation class to specify security constraints to be enforced by a Servlet container on HTTP protocol messages.|

--- 
SERVLET TO JSP

ServletClass(demojsp) -> to -> file name(demo.jsp)

<% any code in it %> ----- will get from ----- doGet, doPost, or service --- called as scriptlet

If we want to declare a variable out of service or in servlet

Use <%!  int value = 10  %> --- called as declaration

If we want to import any package use

<%@ page import = "java.util.Date", "another" %> ---- called as directive tag

If we want to print instead of using PrintWriter use

<%= k %> --- out.println(k)  ---- called as expression tag

