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
setting the content type of html page.
using `setContentType()` of Http servlet response i.e `response.setContentType("text/html")` other can also be used like `("text/mp3")`
---
PRINTWRITER
To send the response from servlet to client we should estabilish writer stream and this writer stream can be created by using printwriter class
Syntax:
```PrintWriter pw = response.getWriter();
pw.println("MESSAGE");```
