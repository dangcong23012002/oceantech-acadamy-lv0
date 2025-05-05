public class Person {
    private int id; // Thành viên dữ liệu
    private String name; // Tên
    private String birth; // Ngày sinh
    private String address; // Địa chỉ
    private double height; // Chiều cao
    private double weight; // Cân nặng

    // khai báo constructor không tham số (vì đây là lớp cha)
    public Person() {}

    // khai báo constructor tham số
    public Person(int id, String name, String birth, String address, double height, double weight) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }
}
