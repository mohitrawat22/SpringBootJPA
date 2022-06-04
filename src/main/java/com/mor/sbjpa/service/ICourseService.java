package com.mor.sbjpa.service;

import com.mor.sbjpa.model.Course;

import java.util.List;

public interface ICourseService {

    public List<Course> allCourse();

    public Course addCourse(Course course);

}
