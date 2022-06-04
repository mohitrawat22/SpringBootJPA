package com.mor.sbjpa.controller;

import com.mor.sbjpa.model.CourseMaterial;
import com.mor.sbjpa.service.ICourseMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course-material")
public class CourseMaterialController {

    @Autowired
    private ICourseMaterialService iCourseMaterialService;

    @GetMapping("/all-course-material")
    public List<CourseMaterial> allCourseMaterial() {
        return iCourseMaterialService.allCourseMaterial();
    }

    @PostMapping("/add-course-material")
    public CourseMaterial addCourseMaterial(@RequestBody CourseMaterial courseMaterial) {
        return iCourseMaterialService.addCourseMaterial(courseMaterial);
    }

}
