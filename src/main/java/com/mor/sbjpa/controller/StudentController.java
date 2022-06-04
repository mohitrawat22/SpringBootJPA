package com.mor.sbjpa.controller;

import com.mor.sbjpa.model.Student;
import com.mor.sbjpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    @GetMapping("/all-students")
    public List<Student> getAllStudents() {
        return iStudentService.getAllStudents();
    }

    @GetMapping("/first-name")
    public List<Student> getStudentByFirstName(@RequestParam("firstName") String firstName) {
        //System.out.println("firstname: "+firstName);
        return iStudentService.getStudentsByFirstName(firstName);
    }

    @GetMapping("/last-name")
    public Student getStudentByLastName(@RequestParam("lastName") String lastName) {
        return iStudentService.getStudentByLastName(lastName);
    }

    @GetMapping("/email-id")
    public Student getStudentByEmailId(@RequestParam("emailId") String emailId) {
        return iStudentService.getStudentByEmailId(emailId);
    }

    @GetMapping("/student-id")
    public Student getStudentByStudentId(@RequestParam("studentId") Long studentId) {
        return iStudentService.getStudentByStudentId(studentId);
    }

    @GetMapping("/first-name-contains")
    public List<Student> getStudentByPartOfFirstName(@RequestParam("partOfFirstName") String partOfFirstName) {
        return iStudentService.getStudentByPartOfFirstName(partOfFirstName);
    }

    @PatchMapping("/update-student")
    public int updateStudentNameByEmailId(@RequestParam("firstName") String firstName, @RequestParam("emailId") String emailId) {
        return iStudentService.updateStudentNameByEmailId(firstName, emailId);
    }

    @PostMapping(
            path = "/add-student",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Student addStudent(@RequestBody Student student) {
        return iStudentService.addStudent(student);
    }

}
