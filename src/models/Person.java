package models;

public class Person {
    private static int id = 1; // Thành viên dữ liệu (lưu trong bộ nhớ)
    private String name; // Tên
    private String birth; // Ngày sinh
    private String address; // Địa chỉ
    private double height; // Chiều cao
    private double weight; // Cân nặng

    // khai báo constructor không tham số (vì đây là lớp cha)
    public Person() {}

    // khai báo constructor tham số
    public Person(String name, String birth, String address, double height, double weight) {
        id++;
        this.name = name;
        this.birth = birth;
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

    public String getBirth() {
        return birth;
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
}
