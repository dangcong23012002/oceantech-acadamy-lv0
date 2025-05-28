package services;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentManager {
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        boolean isValidate = true;
        do {
            System.out.print("Nhập tên: ");
            String name = sc.nextLine();
            if (name.length() > 100) {
                System.out.println("Tên phải nhỏ hơn 100 ký tự");
                isValidate = false;
            } else if (name.isEmpty() || (name.length() > 0 && name.trim().isEmpty())) { // trống và chứa ký tự trắng (có thể đổi thành isBlank())
                System.out.println("Tên không được trống");
                isValidate = false;
            } else if (!Pattern.matches("^[a-zA-Z_0-9 ]+$", name)) {
                System.out.println("Tên không được chứa ký tự đặc biệt");
                isValidate = false;
            } else {
                isValidate = true;
            }
        } while (!isValidate);


        System.out.print("Nhập ngày sinh: ");
        String birth = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Nhập chiều cao: ");
        double height = sc.nextDouble();
        System.out.print("Nhập cân nặng: ");
        double weight = sc.nextDouble();
        System.out.print("Nhập mã sinh viên: ");
        String studentCode = sc.nextLine();
        System.out.print("Nhập trường đang theo học: ");
        String collage = sc.nextLine();
        System.out.print("Nhập năm bắt đầu học: ");
        int yearBegin = sc.nextInt();
        System.out.print("Nhập điểm trung bình tích luỹ (GPA): ");
        double gpa = sc.nextDouble();
    }
}
