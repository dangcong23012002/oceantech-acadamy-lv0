package model;

import common.Constants;

import java.time.LocalDate;

public class Person {
    private static int nextId = Constants.MIN_ID; // Thành viên dữ liệu (lưu trong bộ nhớ)
    private int id;
    private String name; // Tên
    private LocalDate dateOfBirth; // Ngày sinh
    private String address; // Địa chỉ
    private Float height; // Chiều cao
    private Float weight; // Cân nặng

    // khai báo constructor không tham số (vì đây là lớp cha)
    public Person() {}

    // khai báo constructor tham số
    public Person(String name, LocalDate dateOfBirth, String address, Float height, Float weight) {
        this.id = nextId++;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }

    // phương thức getter và setter để truy xuất và chỉnh sửa dữ liệu
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", birthOfDate=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight + ", ";
    }
}
