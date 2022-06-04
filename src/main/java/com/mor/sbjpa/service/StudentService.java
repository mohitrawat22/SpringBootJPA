package com.mor.sbjpa.service;

import com.mor.sbjpa.model.Student;
import com.mor.sbjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByEmailId(String emailId) {
        return studentRepository.getStudentByEmailAddress(emailId);
    }

    @Override
    public Student getStudentByLastName(String lastName) {
        return studentRepository.getStudentByLastName(lastName);
    }

    @Override
    public Student getStudentByStudentId(Long studentId) {
        return studentRepository.getStudentByStudentId(studentId);
    }

    @Override
    public List<Student> getStudentsByFirstName(String firstName) {
        return studentRepository.findByFirstName(firstName);
    }

    @Override
    public List<Student> getStudentByPartOfFirstName(String partOfFirstName) {
        return studentRepository.findByFirstNameContaining(partOfFirstName);
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public int updateStudentNameByEmailId(String firstName, String emailId) {
        return studentRepository.updateStudentNameByEmailId(firstName, emailId);
    }

}
