import java.util.*;

public class Student {
    String full_name;
    String major;
    ArrayList<Course> courses;

    Student(String fl_name, String mjr) {
        full_name = fl_name;
        major = mjr;
        courses = new ArrayList<Course>();
    }

    class Course {
        String name;
        double score;

        Course(String n, double s) {
            name = n;
            score = s;
        }
    }

    void addCourse(String name, double score) {
        Course c = new Course(name, score);
        courses.add(c);
    }

    double avgCalculate() {
        double sum = 0;
        for (Course course : courses) {
            sum += course.score;
        }
        return sum / courses.size();
    }

    String information() {
        String template = "Full Name -> %s\n\rCourses -> %s";
        ArrayList<String> crs = new ArrayList<String>();
	for(Course c : courses)
            crs.add(c.name);
	return String.format(template, full_name, crs.toString());
    }
}
