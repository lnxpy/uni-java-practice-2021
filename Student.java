import java.util.*;

public class Student {
    String full_name;
    String major;
    ArrayList<Course> courses = new ArrayList<Course>();

    Student(String fl_name, String mjr) {
        full_name = fl_name;
        major = mjr;
    }

    class Course {
        String name;
        double score;

        Course(String n, double s) {
            name = n;
            score = s;
        }
    }

    void add_course(String name, double score) {
        Course c = new Course(name, score);
        courses.add(c);
    }

    double avg_calculate() {
        double sum = 0;
        for (Course course : courses) {
            sum += course.score;
        }
        return sum / courses.size();
    }

    String information() {
        String template = "Full Name -> %s\n\rCourses -> %s";

        // using foreach for the course conversion instead
        return String.format(template, full_name, courses.toString());
    }
}