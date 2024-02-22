import java.util.ArrayList;
import java.util.List;


public class Gradebook {
    private List<Student> students;
    private List<String> assignments;

    public Gradebook() {
        students = new ArrayList<>();
        assignments = new ArrayList<>();
    }

    public void createStudent(String name) {
        students.add(new Student(name));
    }

    public void addAssignment(String assignment) {
        assignments.add(new String(assignment));
    }

    public void gradeAssignment(String assignment, String studentName, double grade) {
        Student student = getStudent(studentName);
        if(student != null) {
            student.gradeAssignment(assignment, grade);
        }

    }

    public double getAverageGrade(String assignment) {
        double total = 0;
        int count = 0;
        for(Student student : students) {
            Double grade = student.getGrade(assignment);
            if(grade != null) {
                total += grade;
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }

    public double getMinimumGrade(String assignment) {
        double min = Double.MAX_VALUE;
        for (Student student : students) {
            Double grade = student.getGrade(assignment);
            if (grade != null && grade < min) {
                min = grade;
            }
        }
        return min == Double.MAX_VALUE ? 0 : min;
    }

    public double getMaximumGrade(String assignment) {
        double max = Double.MIN_VALUE;
        for (Student student : students) {
            Double grade = student.getGrade(assignment);
            if (grade != null && grade > max) {
                max = grade;
            }
        }
        return max == Double.MIN_VALUE ? 0 : max;
    }

    public double getAverageOverall() {
        double total = 0;
        int count = 0;
        for (Student student : students) {
            total += student.getAverageGrade();
            count++;
        }
        return count > 0 ? total / count : 0;
    }

    public double getMaxOverall() {
        double max = Double.MIN_VALUE;
        for (Student student : students) {
            double averageGrade = student.getAverageGrade();
            if (averageGrade > max) {
                max = averageGrade;
            }
        }
        return max == Double.MIN_VALUE ? 0 : max;
    }

    public double getMinOverall() {
        double min = Double.MAX_VALUE;
        for (Student student : students) {
            double averageGrade = student.getAverageGrade();
            if (averageGrade < min) {
                min = averageGrade;
            }
        }
        return min == Double.MAX_VALUE ? 0 : min;
    }

    public double getStudentsGrade() {
        return 0;
    }

    public String toString() {
        // ?
    }

    public Student getStudent(String studentName) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                return student;
            }
        }
        return null;
    }

}
