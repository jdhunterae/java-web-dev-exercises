package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

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
}
