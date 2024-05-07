package org.example.student_enrollment_system.service;

import java.util.List;
import org.example.student_enrollment_system.model.Student;
import org.example.student_enrollment_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  @Autowired
  private StudentRepository repository;

  /**
   * Saves a {@link  Student} entity to the repository. If the student already exists
   * (determined by uniques identifier, typically ID), this method will update
   * the existing student. If the student does not exist, a new entry will be created
   * in the repository.
   *
   * @param student the {@link  Student} object to be saved; must not be null.
   * @return the saved {@link  Student} object
   *
   * */
  public Student saveStudent(Student student) {
    return repository.save(student);
  }

  public List<Student> getAllStudents(){
    return repository.findAll();
  }
}
