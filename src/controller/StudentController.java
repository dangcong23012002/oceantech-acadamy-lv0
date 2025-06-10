package controller;

import common.Validate;
import model.Student;
import service.StaticStudentService;
import service.StudentServiceInterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class StudentController {
    private final Scanner sc = new Scanner(System.in);
    private final StudentServiceInterface studentService = new StaticStudentService();

    public StudentController() {}

    public void addStudent() {
        System.out.println("->Add new student");
        studentService.addStudent(inputStudentFromKeyboard());
    }

    public void searchById() {
        System.out.println("->Search student by Id");
        Integer id = null;
        while (id == null) {
            System.out.print("Enter Id: ");
            try {
                id = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println("Error: Invalid format. Id must be a number!");
            } finally {
                sc.nextLine();
            }
        }
        Student student = studentService.searchById(id);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("No student code found with code " + id);
        }
    }

    private String inputName() {
        String name;
        do {
            System.out.print("Enter name: ");
            name = sc.nextLine();
        } while (!Validate.isValidName(name));
        return name;
    }

    private LocalDate inputDateOfBirth() {
        LocalDate dateOfBirth = null;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {
            try {
                System.out.print("Enter date of birth (dd/MM/yyyy): ");
                dateOfBirth = LocalDate.parse(sc.nextLine(), dateFormat);
            } catch (DateTimeParseException ex) {
                System.err.println("Error: Invalid format. Invalid date of birth!");
            }
        } while (!Validate.isValidDateOfBirth(dateOfBirth));
        return dateOfBirth;
    }

    private String inputAddress() {
        String address;
        do {
            System.out.print("Enter address: ");
            address = sc.nextLine();
        } while (!Validate.isValidAddress(address));
        return address;
    }

    private Float inputHeight() {
        Float height = null; // Kiểu primitive không thể là null, đôi khi cần đại diện cho chưa có giá trị
        do {
            System.out.print("Enter height (cm): ");
            try {
                height = sc.nextFloat();
            } catch (InputMismatchException ex) {
                System.err.println("Error: Invalid format. Height must be a number!");
            } finally {
                sc.nextLine(); // xoá bộ nhớ đệm, bỏ qua chuỗi sai
            }
        } while (!Validate.isValidHeight(height));
        return height;
    }

    private Float inputWeight() {
        Float weight = null;
        do {
            System.out.print("Enter weight (kg): ");
            try {
                weight = sc.nextFloat();
            } catch (InputMismatchException ex) {
                System.err.println("Error: Invalid format. Weight must be a number!");
            } finally {
                sc.nextLine(); // xoá bộ nhớ đệm, bỏ qua chuỗi sai
            }
        } while (!Validate.isValidWeight(weight));
        return weight;
    }

    private String inputStudentCode() {
        String studentCode;
        do {
            System.out.print("Enter student code: ");
            studentCode = sc.nextLine();
            if (studentService.searchStudentCode(studentCode) != null) {
                System.out.println("Student code already exists " + studentCode);
            }
        } while (!Validate.isValidStudentCode(studentCode) || studentService.searchStudentCode(studentCode) != null);
        return studentCode;
    }

    private String inputSchoolName() {
        String schoolName;
        do {
            System.out.print("Enter school name: ");
            schoolName = sc.nextLine();
        } while (!Validate.isValidSchoolName(schoolName));
        return schoolName;
    }

    private Integer inputStartYear() {
        Integer yearOfStarting = null;
        do {
            System.out.print("Enter year of start: ");
            try {
                yearOfStarting = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println("Error: Invalid format. Starting year must be a number!");
            } finally { // luôn luôn được thực thi cho dù có ngoại lệ sảy ra hay không
                sc.nextLine();
            }
        } while (!Validate.isValidYearOfStarting(yearOfStarting));
        return yearOfStarting;
    }

    private Float inputGpa() {
        Float gpa = null;
        do {
            System.out.print("Enter gpa: ");
            try {
                gpa = sc.nextFloat();
            } catch (InputMismatchException ex) {
                System.err.println("Error: Incorrect format. Gpa must be a number!");
            } finally {
                sc.nextLine();
            }
        } while (!Validate.isValidGpa(gpa));
        return gpa;
    }

    private Student inputStudentFromKeyboard() {
        String name = inputName();
        LocalDate dateOfBirth = inputDateOfBirth();
        String address = inputAddress();
        Float height = inputHeight();
        Float weight = inputWeight();
        String studentCode = inputStudentCode();
        String schoolName = inputSchoolName();
        Integer yearOfStarting = inputStartYear();
        Float gpa = inputGpa();
        return new Student(name, dateOfBirth, address, height, weight, studentCode, schoolName, yearOfStarting, gpa);
    }
}
