package com.mor.sbjpa.service;

import com.mor.sbjpa.model.CourseMaterial;
import com.mor.sbjpa.repository.CourseMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseMaterialService implements ICourseMaterialService {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Override
    public List<CourseMaterial> allCourseMaterial() {
        return courseMaterialRepository.findAll();
    }

    @Override
    public CourseMaterial addCourseMaterial(CourseMaterial courseMaterial) {
        return courseMaterialRepository.save(courseMaterial);
    }
}
