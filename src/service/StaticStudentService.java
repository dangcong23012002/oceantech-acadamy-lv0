package service;

import model.Student;

public class StaticStudentService implements StudentServiceInterface {
    private final int MAX_STUDENT = 100;
    Student[] listStudent = new Student[MAX_STUDENT];
    private static int count = 0;

    @Override
    public void addStudent(Student student) {
        listStudent[count++] = student;
        System.out.println("Student added successfully!");
        System.out.println(student);
    }

    @Override
    public Student searchStudentCode(String studentCode) {
        for (int i = 0; i < count; i++) {
            if (listStudent[i].getStudentCode().equals(studentCode)) {
                return listStudent[i];
            }
        }
        return null;
    }

    @Override
    public Student searchById(int id) {
        for (int i = 0; i < count; i++) {
            if (listStudent[i].getId() == id) {
                return listStudent[i];
            }
        }
        return null;
    }
}
