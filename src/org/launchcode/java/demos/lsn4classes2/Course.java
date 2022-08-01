package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course() {
        this("Sample", new Teacher("Bill", "Smith", "English", 1), new ArrayList<Student>());
    }

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public String toString() {
        String teacher = String.format("%s %s", instructor.getFirstName(), instructor.getLastName());
        return String.format("%s: taught by %s (%d students enrolled)", topic, teacher, enrolledStudents.size());
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        if (object == this) {
            return true;
        }

        Course course = (Course) object;
        return course.topic.equals(topic) &&
                course.instructor.equals(instructor) &&
                course.enrolledStudents.equals(enrolledStudents);
    }

    public String getTopic() {
        return topic;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    public boolean isEnrolled(Student student) {
        return enrolledStudents.contains(student);
    }

    public boolean isTeaching(Teacher instructor) {
        return this.instructor.equals(instructor);
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
