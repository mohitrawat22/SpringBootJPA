package com.mor.sbjpa.service;

import com.mor.sbjpa.model.Student;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface IStudentService {

    public List<Student> getAllStudents();

    public Student getStudentByEmailId(String emailId);

    public Student getStudentByLastName(String lastName);

    public Student getStudentByStudentId(Long studentId);
    public List<Student> getStudentsByFirstName(String firstName);
    public List<Student> getStudentByPartOfFirstName(String partOfFirstName);
    public Student addStudent(Student student);

    int updateStudentNameByEmailId(String firstName, String emailId);

}
