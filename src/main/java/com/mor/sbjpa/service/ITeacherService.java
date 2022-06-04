package com.mor.sbjpa.service;

import com.mor.sbjpa.model.Teacher;

import java.util.List;

public interface ITeacherService {

    public List<Teacher> allTeacher();
    public Teacher addTeacher(Teacher teacher);

}
