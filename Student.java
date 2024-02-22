import java.util.ArrayList;
public class Student {

    private String name;
    private ArrayList<String> assignments;
    private ArrayList<Double> assignmentGrades;
    private double grade;


    public Student(String name) {
        this.name = name;
        assignments = new ArrayList<String>();
        assignmentGrades = new ArrayList<Double>();

    }

    private String getName() {
        return name;
    }

    public void addAssignment(String assignName) {
        assignments.add(assignName);
        assignmentGrades.add(-1.00); //meant to represent ungraded
    }

    public void gradeAssignment(String assignment, double grade) {
        for(int i = 0; i < assignments.size(); i++) {
            if(assignments.get(i).equals(assignment)) {
                assignmentGrades.set(i, grade);
            }
            else {
                System.out.println("Assignment not found");
            }
        }
    }

    public double getAssignmentGrade(String assignment) {
        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i).equals(assignment)) {
                return assignmentGrades.get(i);
            }
        }
        return -1.00; //meant to represent assignment not being found
    }

    public double getOverallGrade() {
        double overallGrade = 0.00;
        int n = 0;
        for (int i = 0; i < assignments.size(); i++) {
            if (assignmentGrades.get(i) != -1.00) {
                overallGrade += assignmentGrades.get(i);
                n++;
            }
        }
        return overallGrade / n;
    }

    public String toString() {
    return "Student Name: " + getName() + " Overall grade: " + getOverallGrade();
    }


}
