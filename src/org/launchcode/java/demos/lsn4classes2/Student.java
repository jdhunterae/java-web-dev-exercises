package org.launchcode.java.demos.lsn4classes2;

public class Student {
    private static final int FRESHMAN_MAX = 29, SOPHOMORE_MAX = 59, JUNIOR_MAX = 89;

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }



    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public String getGradeLevel() {
        if (this.numberOfCredits <= FRESHMAN_MAX) {
            return "freshman";
        } else if (this.numberOfCredits <= SOPHOMORE_MAX) {
            return "sophomore";
        } else if (this.numberOfCredits <= JUNIOR_MAX) {
            return "junior";
        } else {
            return "senior";
        }
    }

    public void addGrade(int courseCredits, double grade) {
        double quality_score = this.gpa * this.numberOfCredits;
        quality_score += grade * courseCredits;

        this.numberOfCredits += courseCredits;
        this.gpa = quality_score / this.numberOfCredits;
    }

    @Override
    public String toString() {
        String text = String.format("%s : %s (Cr: %d)\n  GPA: %.2f",
                this.name, this.getGradeLevel(),
                this.numberOfCredits, this.gpa);
        return text;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        if (object == this) {
            return true;
        }

        return ((Student) object).getStudentId() == getStudentId();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally", 1, 1, 4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
