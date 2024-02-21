import java.util.ArrayList;
public class Student {

    private String name;
    private ArrayList<String> assignments;
    private double grade;


    public Student(String name) {
        this.name = name;

    }

    public void addAssignment(String assignName) {
        assignments.add(assignName);
    }

    public void gradeAssignment(String assignment, double grade) {
        String result = assignment + "grade: " + grade;
        assignments.remove(assignment);
        assignments.add(result);
    }

    double getAssignmentGrade(String assignment) {
        return grade;
    }

    public double getOverallGrade() {
    return
    }

    public String toString() {
    return "g";
    }


}
