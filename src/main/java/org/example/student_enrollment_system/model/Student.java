package org.example.student_enrollment_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Temporal(TemporalType.DATE)
  private Date enrollmentDate;


  private String courses;


  public Student() {
  }

  public Student(String name, Date enrollmentDate, String courses) {
    this.name = name;
    this.enrollmentDate = enrollmentDate;
    this.courses = courses;
  }

  public Long getId() {
    return id;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getEnrollmentDate() {
    return enrollmentDate;
  }

  public void setEnrollmentDate(Date enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }

  public String getCourses() {
    return courses;
  }

  public void setCourses(String courses) {
    this.courses = courses;
  }
}
