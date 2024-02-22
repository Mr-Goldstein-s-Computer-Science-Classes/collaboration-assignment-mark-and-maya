
public class Main {

    public static void main(String[] args) {

        //Creating student objects
        Gradebook grades = new Gradebook();
        Student tyler = new Student("Tyler");
        Student james = new Student("James");
        Student ethan = new Student("Ethan");
        Student scotty = new Student("Scotty");
        Student david = new Student("David");
        Student patrick = new Student("Patrick");

        //Creating students inside of grades
        grades.createStudent("Tyler");
        grades.createStudent("James");
        grades.createStudent("Ethan");
        grades.createStudent("Scotty");
        grades.createStudent("David");
        grades.createStudent("Patrick");

        grades.addAssignment("Stacks And Queues Station Activity");
        grades.addAssignment("Stacks and queues programs");
        grades.addAssignment("Stacks and queues quiz");
        grades.addAssignment("Github Exploration");

        grades.gradeAssignment("Stacks and Queues Station Activity", "Tyler", 94.00);
        grades.gradeAssignment("Stacks and Queues Station Activity", "James", 14.00);
        grades.gradeAssignment("Stacks and Queues Station Activity", "Ethan", 5.00);
        grades.gradeAssignment("Stacks and Queues Station Activity", "Scotty", 100.00);
        grades.gradeAssignment("Stacks and Queues Station Activity", "David", 0.00);
        grades.gradeAssignment("Stacks and Queues Station Activity", "Patrick", 79.00);

        grades.gradeAssignment("Stacks and queues programs", "Tyler", 100.00);
        grades.gradeAssignment("Stacks and queues programs", "James", 64.00 );
        grades.gradeAssignment("Stacks and queues programs", "Ethan", 100.00);
        grades.gradeAssignment("Stacks and queues programs", "Scotty", 101.00);
        grades.gradeAssignment("Stacks and queues programs", "David", 92.00);
        grades.gradeAssignment("Stacks and queues programs", "Patrick", 83.00);

        grades.gradeAssignment("Stacks and queues quiz", "Tyler", 100.00);
        grades.gradeAssignment("Stacks and queues quiz", "James", 100.00);
        grades.gradeAssignment("Stacks and queues quiz", "Ethan", 100.00);
        grades.gradeAssignment("Stacks and queues quiz", "Scotty", 87.00);
        grades.gradeAssignment("Stacks and queues quiz", "David", 92.00);
        grades.gradeAssignment("Stacks and queues quiz", "Patrick", 83.00);

        grades.gradeAssignment("Github exploration", "Tyler", 96.00);
        grades.gradeAssignment("Github exploration", "James", 43.00);
        grades.gradeAssignment("Github exploration", "Ethan", 100.00);
        grades.gradeAssignment("Github exploration", "Scotty", 97.00);
        grades.gradeAssignment("Github exploration", "David", 28.00);
        grades.gradeAssignment("Github exploration", "Patrick", 100.00);

        //Printing out all the objects
        System.out.println(grades);
        System.out.println(tyler);
        System.out.println(james);
        System.out.println(ethan);
        System.out.println(scotty);
        System.out.println(david);
        System.out.println(patrick);

        //Stats for all overall grades
        System.out.println(tyler.toString());
        System.out.println(james.toString());
        System.out.println(ethan.toString());
        System.out.println(scotty.toString());
        System.out.println(david.toString());
        System.out.println(patrick.toString());













    }

}
