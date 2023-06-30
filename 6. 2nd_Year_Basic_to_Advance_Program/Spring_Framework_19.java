// // Set up your development environment:

// // Install Java Development Kit (JDK).
// // Install Apache Maven.
// // Install an Integrated Development Environment (IDE) like Eclipse or IntelliJ IDEA.
// // Create a new Maven project in your IDE.

// // Add the necessary dependencies to your Maven pom.xml file:


// <dependencies>
//     <!-- Spring Core -->
//     <dependency>
//         <groupId>org.springframework</groupId>
//         <artifactId>spring-context</artifactId>
//         <version>5.3.10</version>
//     </dependency>

//     <!-- Spring Web -->
//     <dependency>
//         <groupId>org.springframework</groupId>
//         <artifactId>spring-web</artifactId>
//         <version>5.3.10</version>
//     </dependency>
// </dependencies>
// Create a new Java class called HelloController that serves as the controller in your Spring application:
// java
// Copy code
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

// @Controller
// public class HelloController {
//     @RequestMapping("/")
//     @ResponseBody
//     public String hello() {
//         return "Hello, Spring!";
//     }
// }
// // Create a new XML file called applicationContext.xml in the src/main/resources directory. This file serves as the application context configuration for your Spring application:

// <beans xmlns="http://www.springframework.org/schema/beans"
//        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//        xsi:schemaLocation="http://www.springframework.org/schema/beans
//                            http://www.springframework.org/schema/beans/spring-beans.xsd">

//     <context:component-scan base-package="com.example.controller" />
//     <mvc:annotation-driven />
// </beans>
// // Configure the web application deployment descriptor (web.xml) in the WEB-INF directory:

// <web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//          xmlns="http://xmlns.jcp.org/xml/ns/javaee"
//          xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
//                              http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
//          id="WebApp_ID" version="4.0">
//     <display-name>SpringExample</display-name>

//     <servlet>
//         <servlet-name>dispatcher</servlet-name>
//         <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//         <init-param>
//             <param-name>contextConfigLocation</param-name>
//             <param-value>/WEB-INF/applicationContext.xml</param-value>
//         </init-param>
//         <load-on-startup>1</load-on-startup>
//     </servlet>

//     <servlet-mapping>
//         <servlet-name>dispatcher</servlet-name>
//         <url-pattern>/</url-pattern>
//     </servlet-mapping>
// </web-app>
// // Run the application using your IDE or by building the Maven project and deploying it to a servlet container like Apache Tomcat.

// // Access the application by navigating to http://localhost:8080 in your web browser. You should see the message "Hello, Spring!" displayed on the page.