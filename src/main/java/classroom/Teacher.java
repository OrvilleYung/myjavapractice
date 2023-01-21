package classroom;

import java.util.Arrays;

public class Teacher implements Staff{
    private String firstName;
    private String surName;
    private int gender;
    private int teacherId;

    private static int noOfObjectCreated;
    private String[] subject = new String[2];

    public Teacher(String firstName, String surName, int gender) {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        noOfObjectCreated++;
        teacherId = noOfObjectCreated;

    }

    public Teacher(String firstName, String surName, int gender, String[] subject) {
        this(firstName, surName, gender);
        this.subject = subject;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName (String surName) {
        this.surName = surName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender (int gender) {
        this.gender = gender;
    }

    public int getTeacherId () {
        return teacherId;
    }
    public String[] getSubject () {
        System.out.println(firstName + " teaches " + Arrays.toString(subject));
        return subject;
    }
    public void setSubjects(String[] subject) {
        this.subject = subject;
    }
    public boolean addSubject(String subject) {
        for (int i = 0; i < this.subject.length; i++) {
            if (this.subject[i] == null) {
                this.subject[i] = subject;
                return true;}
                else if(this.subject[i].equals(subject)) {
                    System.out.println("Subject is already entered");
                    return false;
            }
        }
        return false;
    }
    public boolean changeSubject(String currentSubject, String newSubject) {
        for (int i = 0; i < this.subject.length; i++) {
            if (this.subject[i].equals(currentSubject)) {
                this.subject[i] = newSubject;
            } else return false; // unable to change subject
        }
        return false;
    }

    @Override
    public void markGrade() {
        System.out.println("Grade is marked by " + getFirstName());
    }
}
