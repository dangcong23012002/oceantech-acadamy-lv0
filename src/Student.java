public class Student extends Person {
    private String studentId;
    private String collage; // trường đại học
    private int yearBegin; // năm bắt đầu
    private double averageScore; // điểm trung bình tích luỹ

    public Student(int id, String name, String birth, String address, double height, double weight, String studentId, String collage, int yearBegin, double averageScore) {
        super(id, name, birth, address, height, weight);
        this.studentId = studentId;
        this.collage = collage;
        this.yearBegin = yearBegin;
        this.averageScore = averageScore;
    }
}
