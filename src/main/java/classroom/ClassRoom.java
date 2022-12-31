package classroom;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private int studentNumber;
    private Student[] students;
    private List<Teacher> teachers;

    public ClassRoom(int maxStudentSize) {
        this.students = new Student[maxStudentSize]; // 30
        this.teachers = new ArrayList<>();
        this.studentNumber = 0;
    }

    public boolean addStudent(String studentName) {
        if (this.studentNumber < 30) {
            // Student student = new Student(studentName);
            // students[studentNumber] = student;
            // studentNumber = studentNumber + 1;
            students[studentNumber++] = new Student(studentName);
            return true;
        }
        return false;
    }
}
