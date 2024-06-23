package org.example.grade;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double mutiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::mutiplyCreditAndCourseGrade)
                .sum();

        /*double mutipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            mutipliedCreditAndCourseGrade += course.mutiplyCreditAndCourseGrade();
        }
        return mutipliedCreditAndCourseGrade;*/
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
