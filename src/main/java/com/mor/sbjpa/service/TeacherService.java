package com.mor.sbjpa.service;

import com.mor.sbjpa.model.Teacher;
import com.mor.sbjpa.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TeacherService implements ITeacherService{

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> allTeacher() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
