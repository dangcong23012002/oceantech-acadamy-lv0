package service;

import model.Student;

public interface StudentServiceInterface {
    public void addStudent(Student student);
    public Student searchStudentCode(String studentCode);
    public Student searchById(int id);
}
