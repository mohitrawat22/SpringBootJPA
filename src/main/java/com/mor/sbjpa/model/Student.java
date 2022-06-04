package com.mor.sbjpa.model;

import javax.persistence.*;

@Entity
@Table(
        name = "student",
        uniqueConstraints = @UniqueConstraint(
                name = "emailid_unique",
                columnNames = "email_address"
        )
)
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long studentId;
    private String firstName;
    private String lastName;

    @Column(
            name = "email_address",
            nullable = false
    )
    private String emailId;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;

    public Student() {
    }

    public Student(Long studentId, String firstName, String lastName, String emailId, String guardianName, String guardianEmail, String guardianMobile) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.guardianName = guardianName;
        this.guardianEmail = guardianEmail;
        this.guardianMobile = guardianMobile;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        //System.out.println("StudentId: "+studentId);
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //System.out.println("Student FirstName: "+firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //System.out.println("Student LastName: "+lastName);
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        //System.out.println("Student EmailId: "+emailId);
        this.emailId = emailId;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        //System.out.println("Student GuardianName: "+guardianName);
        this.guardianName = guardianName;
    }

    public String getGuardianEmail() {
        return guardianEmail;
    }

    public void setGuardianEmail(String guardianEmail) {
        //System.out.println("Student GuardianEmail: "+guardianEmail);
        this.guardianEmail = guardianEmail;
    }

    public String getGuardianMobile() {
        return guardianMobile;
    }

    public void setGuardianMobile(String guardianMobile) {
        //System.out.println("Student GuardianMobile: "+guardianMobile);
        this.guardianMobile = guardianMobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", guardianName='" + guardianName + '\'' +
                ", guardianEmail='" + guardianEmail + '\'' +
                ", guardianMobile='" + guardianMobile + '\'' +
                '}';
    }
}
