package com.mor.sbjpa.repository;

import com.mor.sbjpa.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
