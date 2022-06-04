package com.mor.sbjpa.service;

import com.mor.sbjpa.model.CourseMaterial;
import com.mor.sbjpa.repository.CourseMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ICourseMaterialService {


    public List<CourseMaterial> allCourseMaterial();
    public CourseMaterial addCourseMaterial(CourseMaterial courseMaterial);

}
