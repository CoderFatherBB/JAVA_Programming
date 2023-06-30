// // Set up your development environment:

// // Install Java Development Kit (JDK).
// // Download the Hibernate framework and add the required JAR files to your project's classpath.
// // Create a new Java class called Student that represents an entity in your application:


// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// @Entity
// public class Student {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;
//     private String name;
//     private int age;
    
//     // getters and setters
//     // ...
// }


// // Create a new Java class called HibernateUtil that sets up the Hibernate configuration:

// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;

// public class HibernateUtil {
//     private static SessionFactory sessionFactory;
    
//     static {
//         try {
//             sessionFactory = new Configuration().configure().buildSessionFactory();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
    
//     public static SessionFactory getSessionFactory() {
//         return sessionFactory;
//     }
// }


// // Create a new Java class called MainApp to demonstrate the usage of Hibernate:

// import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.Transaction;

// public class Hybernate_Framework_20 {
//     public static void main(String[] args) {
//         // Create a new student
//         Student student = new Student();
//         student.setName("John Doe");
//         student.setAge(20);
        
//         // Save the student using Hibernate
//         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//         Session session = sessionFactory.openSession();
//         Transaction transaction = session.beginTransaction();
//         session.save(student);
//         transaction.commit();
//         session.close();
        
//         System.out.println("Student saved successfully!");
//     }
// }