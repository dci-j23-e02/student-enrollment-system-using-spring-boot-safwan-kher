package org.example.student_enrollment_system.controller;

import org.example.student_enrollment_system.model.Student;
import org.example.student_enrollment_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

  @Autowired
  private StudentService service;

  @GetMapping("/")
  public String viewHomePage(Model model){
    model.addAttribute("students", service.getAllStudents());
    return "home";
  }

  @GetMapping("/enroll")
  public String showEnrollmentForm(Model model){
    Student student = new Student();
    model.addAttribute("student", student);
  return "enroll";
  }

  @PostMapping("/enroll")
  public String submitStudentForm(@ModelAttribute("student") Student student, BindingResult result){
    if(result.hasErrors()){
      return "enroll"; // return to the form page if there is any error
    }

    // save the student object
    service.saveStudent(student);
    return "redirect:/";
  }
}
