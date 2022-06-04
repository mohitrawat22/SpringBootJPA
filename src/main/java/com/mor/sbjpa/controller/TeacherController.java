package com.mor.sbjpa.controller;

import com.mor.sbjpa.model.CourseMaterial;
import com.mor.sbjpa.model.Teacher;
import com.mor.sbjpa.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private ITeacherService iTeacherService;

    @GetMapping("/all-teacher")
    public List<Teacher> allTeacher() {
        return iTeacherService.allTeacher();
    }

    @PostMapping("/add-teacher")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return iTeacherService.addTeacher(teacher);
    }

}
