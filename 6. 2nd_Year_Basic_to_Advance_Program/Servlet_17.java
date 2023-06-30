// // Create a new Java project in your IDE.
// // Add the required Servlet API libraries to your project's classpath. These libraries can typically be found in the lib directory of your servlet container, such as Apache Tomcat.
// // Create a new Java class called HelloServlet that extends the HttpServlet class. This class will handle the HTTP GET request and send a response.



// import java.io.IOException;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// public class Servlet_17 extends HttpServlet {
//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {
//         response.setContentType("text/html");
//         response.getWriter().println("<h1>Hello, Servlet!</h1>");
//     }
// }

// // Create a new XML file called web.xml in the WEB-INF directory of your project. This file is the deployment descriptor for your web application and specifies the mapping of the servlet.
// <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee" 
//          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
//          xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
//                              http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" 
//          version="4.0">
//     <servlet>
//         <servlet-name>HelloServlet</servlet-name>
//         <servlet-class>HelloServlet</servlet-class>
//     </servlet>
//     <servlet-mapping>
//         <servlet-name>HelloServlet</servlet-name>
//         <url-pattern>/hello</url-pattern>
//     </servlet-mapping>
// </web-app>
