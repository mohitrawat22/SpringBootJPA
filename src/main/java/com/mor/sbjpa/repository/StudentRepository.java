package com.mor.sbjpa.repository;

import com.mor.sbjpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);
    List<Student> findByFirstNameContaining(String partOfFirstName);

    // based on class and attributes in class, not the database or database columns
    // JPQL
    @Query("select s from Student s where s.emailId = ?1")
    Student getStudentByEmailAddress(String emailId);

    // If you want only the first name of student, not the whole student record
    // @Query("select s.firstName from Student s where s.emailId = ?1")
    // String getStudentFirstNameByEmailAddress(String emailId);

    @Query(
            value = "select * from student s where s.last_name = ?1",
            nativeQuery = true
    )
    Student getStudentByLastName(String lastName);

    @Query(
            value = "select * from student s where s.student_id = :studentId",
            nativeQuery = true
    )
    Student getStudentByStudentId(@Param("studentId")Long studentId);

    @Modifying
    @Query(
            value = "update student set first_name = ?1 where email_address = ?2",
            nativeQuery = true
    )
    int updateStudentNameByEmailId(String firstName, String emailId);

}
