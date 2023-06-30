// // Create a new HTML file called form.html and add the following code:

// <!DOCTYPE html>
// <html>
// <head>
//     <title>Form Example</title>
//     <style>
//         .container {
//             width: 400px;
//             margin: 50px auto;
//             padding: 20px;
//             background-color: #f4f4f4;
//             border-radius: 5px;
//         }

//         .form-group {
//             margin-bottom: 10px;
//         }

//         .form-group label {
//             display: block;
//             font-weight: bold;
//             margin-bottom: 5px;
//         }

//         .form-group input[type="text"],
//         .form-group textarea {
//             width: 100%;
//             padding: 5px;
//         }

//         .form-group button {
//             padding: 10px 20px;
//             background-color: #4caf50;
//             color: white;
//             border: none;
//             cursor: pointer;
//         }
//     </style>
// </head>
// <body>
//     <div class="container">
//         <h2>Form Example</h2>
//         <form action="process.jsp" method="POST">
//             <div class="form-group">
//                 <label for="name">Name:</label>
//                 <input type="text" id="name" name="name" required>
//             </div>
//             <div class="form-group">
//                 <label for="email">Email:</label>
//                 <input type="text" id="email" name="email" required>
//             </div>
//             <div class="form-group">
//                 <label for="message">Message:</label>
//                 <textarea id="message" name="message" rows="4" required></textarea>
//             </div>
//             <div class="form-group">
//                 <button type="submit">Submit</button>
//             </div>
//         </form>
//     </div>
// </body>
// </html>


// // Create a new JSP file called process.jsp and add the following code:
// <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
// <!DOCTYPE html>
// <html>
// <head>
//     <title>Form Submission Result</title>
// </head>
// <body>
//     <h2>Form Submission Result</h2>
//     <p>Name: <%= request.getParameter("name") %></p>
//     <p>Email: <%= request.getParameter("email") %></p>
//     <p>Message: <%= request.getParameter("message") %></p>
// </body>
// </html>
