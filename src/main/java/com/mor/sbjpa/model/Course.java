package com.mor.sbjpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )
    private Long courseId;
    private String courseName;
    private Integer courseCredit;

    @OneToOne(
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "teacher_id",
            referencedColumnName = "teacherId"
    )
    private Teacher teacher;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "student_course_map",
            joinColumns = @JoinColumn(
                    name = "course_id",
                    referencedColumnName = "courseId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "studentId"
            )
    )
    private List<Student> students;

    public Course() {

    }

    /*
    public Course(Long courseId, String courseName, Integer courseCredit, CourseMaterial courseMaterial) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.courseMaterial = courseMaterial;
    }
    */

    /*
    public Course(Long courseId, String courseName, Integer courseCredit, CourseMaterial courseMaterial, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.courseMaterial = courseMaterial;
        this.teacher = teacher;
    }
    */

    public Course(Long courseId, String courseName, Integer courseCredit, CourseMaterial courseMaterial, Teacher teacher, List<Student> students) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.courseMaterial = courseMaterial;
        this.teacher = teacher;
        this.students = students;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    public CourseMaterial getCourseMaterial() {
        return courseMaterial;
    }

    public void setCourseMaterial(CourseMaterial courseMaterial) {
        this.courseMaterial = courseMaterial;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseCredit=" + courseCredit +
                ", courseMaterial=" + courseMaterial +
                '}';
    }
}
