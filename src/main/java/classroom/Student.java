package classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String studentName;
    private int gender;
    private int studentId = 0;

    private List<String> subjects;

    public Student(String studentName, int gender) {
        this.studentName = studentName;
        this.gender = gender;
        this.studentId ++;
        this.subjects = new ArrayList<String>();
    }

    public String getStudentName() {
        System.out.println("Student name:" + studentName);
        return studentName;
    }

    public void setStudentName (String studentName) {
        this.studentName = studentName;
    }

    public int getGender() {
        return gender;
    }
    // 0: Female, 1: Male
    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setStudentId (int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId () {
        return studentId;
    }

    public void addSubjects(List<String> subjects) {
        this.subjects.addAll(subjects);
    }

    public List<String> getSubjects() {
        System.out.println("Subjects:" + subjects);
        return subjects;
    }
}
