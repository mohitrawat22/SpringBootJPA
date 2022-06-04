package com.mor.sbjpa.controller;

import com.mor.sbjpa.model.Course;
import com.mor.sbjpa.model.CourseMaterial;
import com.mor.sbjpa.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private ICourseService iCourseService;

    @GetMapping("/all-course")
    public List<Course> allCourse() {
        return iCourseService.allCourse();
    }

    @PostMapping("/add-course")
    public Course addCourse(@RequestBody Course course) {
        return iCourseService.addCourse(course);
    }

}
