package services;

public class StudentValidate {
    public String validateName(String name) {
        if (name.length() > 100) {
            return "Tên phải nhỏ hơn 100 ký tự";
        } else if (name.isEmpty()) {
            return "Tên không được trống";
        }
        return name;
    }
}
