package org.example.student_enrollment_system.repository;

import java.util.Date;
import java.util.List;
import org.example.student_enrollment_system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Long> {
      // Standard CRUD methods are automatically provided by extending JpaRepository

  // Custom Operations can be added
      // find the student by name

  //1. Spring Data JPA will automatically generate the SELECT query for this method.
      // List<Student> findByAttributeName(String name);


//2. Using JPQL (Java Persistence Query Language)
    //  @Query("SELECT st FROM Student st WHERE st.name = :name") // JPQL
    //  List<Student> findByAttributeName(@Param("name") String name);

//3. Native SQL
    //  @Query(value = "SELECT * FROM students WHERE name = :name", nativeQuery = true)
    //  List<Student> findByAttributeName(@Param("name") String name);
// 4. Using Named Query
// List<Student> findByAttributeName(@Param("name") String name);

  // Find Students by Course
  List<Student> findByCourses(String course);
  

  // Find Students enrolled after a certain date : using JPQL
  @Query("SELECT s FROM Student s WHERE s.enrollmentDate > :certainDate ")
  List<Student> findStudentsEnrolledAfter(@Param("certainDate") Date date);

  // Find students by name containing a string
  List<Student> findByNameContaining( String name);

  // Add a method to find students by a combination of name and course.
  // Using JPQL:
  @Query("SELECT s FROM Student s WHERE s.name =:name AND s.courses = :course")
  List<Student> findByNameAndCourse(@Param("name") String name,@Param("course") String course);

  // Implement a query to find students who have enrolled within a specific date range.
  // Using JPQL:
  @Query("SELECT s FROM Student s WHERE s.enrollmentDate BETWEEN :start AND :end")
  List<Student> findByEnrollmentDateBetween(@Param("start") Date start, @Param("end") Date end);

  // Create a method to retrieve all students sorted by their enrollment date in descending order.
  // Using JPQL:
  @Query("SELECT s FROM Student s ORDER BY s.enrollmentDate DESC")
  List<Student> findAllByOrderByEnrollmentDateDesc();

}
