package models;

import java.util.Scanner;

public class Student extends Person {
    private String studentCode;
    private String collage; // trường đại học
    private int yearBegin; // năm bắt đầu
    private double gpa; // điểm trung bình tích luỹ

    public Student() {}

    public Student(String name, String birth, String address, double height, double weight, String studentCode, String collage, int yearBegin, double gpa) {
        super(name, birth, address, height, weight);
        this.studentCode = studentCode;
        this.collage = collage;
        this.yearBegin = yearBegin;
        this.gpa = gpa;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getCollage() {
        return collage;
    }

    public int getYearBegin() {
        return yearBegin;
    }

    public double getGpa() {
        return gpa;
    }
}
