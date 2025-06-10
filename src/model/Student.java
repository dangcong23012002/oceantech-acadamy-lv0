package model;

import java.time.LocalDate;

public class Student extends Person {
    private String studentCode;
    private String schoolName; // trường đại học
    private Integer yearOfStarting; // năm bắt đầu
    private Float gpa; // điểm trung bình tích luỹ

    public Student() {}

    public Student(String name, LocalDate dateOfBirth, String address, Float height, Float weight, String studentCode, String schoolName, Integer yearOfStarting, Float gpa) {
        super(name, dateOfBirth, address, height, weight);
        this.studentCode = studentCode;
        this.schoolName = schoolName;
        this.yearOfStarting = yearOfStarting;
        this.gpa = gpa;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Integer getYearOfStarting() {
        return yearOfStarting;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                "studentCode='" + studentCode + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", yearOfStarting=" + yearOfStarting +
                ", GPA=" + gpa;
    }
}
