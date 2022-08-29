import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class test {
    public static void main(String[] args) {

//        String jdbcUrl = "jdbc:postgresql://localhost:5432/hb_student_tracker";
//        String user = "postgres";
//        String password = "postgres";
//        try {
//            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
//            System.out.println("DOne");
//        }
//        catch (Exception e){
//            e.printStackTrace();;
//        }

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetails.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();



//        Instructor omar = session.get(Instructor.class , 5l);
        try {
            Session session = factory.getCurrentSession();
//            Student student = new Student()
//                    .builder()
//                    .firstName("Omaqwerr")
//                    .lastName("Aburish")
//                    .build();
//
//            Employee employee = new Employee()
//                    .builder()
//                    .firstName("Omar")
//                    .lastName("Aburish")
//                    .company("CoTeDe")
//                    .build();

            session.beginTransaction();

//            session.save(student);
//            List<Student> students = session.createQuery("from Student s where s.firstName= 'Omar'")
//                    .getResultList();


//            Student s = session.get(Student.class, Long.valueOf(1));


//            s.setFirstName("Samir noob");
//            System.out.println(students);


//            List<Employee> list = session.createQuery("from Employee s where s.company = 'CoTeDe'").getResultList();
//
//            System.out.println(list);
//
//            session.save(employee);
//            Employee t = session.get(Employee.class , 4l);
//
//            t.setCompany("Sadel");

//            session.delete(t);
//            session.createQuery("delete from  Employee e where  e.id= 2" ).executeUpdate() ;

//            System.out.println(t);
//            session.save(employee);
//            session.createQuery("update Student set firstName = 'OmartheKing'").executeUpdate();


//            Student s = session.get(Student.class ,student.getId());

//            System.out.println(s.getFirstName());


            InstructorDetails instructorDetails = new InstructorDetails()
                    .builder()
                    .youtubeChannel("pewdiepie")
                    .hobby("playing with kids")
                    .build();

//            session.save(instructorDetails);


//            session.getTransaction().commit();
//            System.out.println(instructorDetails.getId());


//            session = factory.openSession();
//
//
//            session.beginTransaction();
//
            Instructor instructor = new Instructor()
                    .builder()
                    .firstName("Omar")
                    .lastName("Aburish")
                    .email("omar.sabqew@fdasg.com")
                    .instructorDetails(instructorDetails)
                    .build();

//


//            System.out.println(omar);
//
//            session.save(instructor);


//            Instructor instructor= session.get(Instructor.class , 5l);

//            session.delete(instructor);


//            InstructorDetails instructorDetails = session.get(InstructorDetails.class ,2l );

//            System.out.println(instructorDetails.getInstructor());

//            instructorDetails.getInstructor().setInstructorDetails(null);
//            session.save(instructorDetails);
//            session.delete(instructorDetails);




//            Course course = new Course()
//                    .builder()
//                    .title("Art")
//                    .build();


//            session.save(instructor);

//            omar.add(course);
//            session.save(course);
//            session.save(omar);

//            System.out.println(omar.getCourses());


//            Course noob = session.get(Course.class , 5l);

//            noob.setInstructor(null);
//            session.delete(omar);

//            session.save(noob);
            session.getTransaction().commit();


        }
        finally {
            session.close();
            factory.close();
        }

//        System.out.println(omar.getInstructorDetails());
    }
}
