import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create lists of courses, teachers, students, and administration
        List<Course> courses = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Constraint> constraints = new ArrayList<>();

        // Input teachers and their preferences
        System.out.println("Enter number of teachers:");
        int numTeachers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numTeachers; i++) {
            System.out.println("Enter teacher's name:");
            String teacherName = scanner.nextLine();

            List<Preference> preferences = new ArrayList<>();
            System.out.println("Enter number of preferences for " + teacherName + ":");
            int numPreferences = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int j = 0; j < numPreferences; j++) {
                System.out.println("Enter day, start time, and end time (e.g., Monday 9 11):");
                String day = scanner.next();
                int startTime = scanner.nextInt();
                int endTime = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                preferences.add(new Preference(day, startTime, endTime));
            }

            teachers.add(new Teacher(teacherName, preferences));
        }

        // Input students and their courses
        System.out.println("Enter number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student's name:");
            String studentName = scanner.nextLine();

            List<Course> studentCourses = new ArrayList<>();
            System.out.println("Enter number of courses for " + studentName + ":");
            int numCourses = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int j = 0; j < numCourses; j++) {
                System.out.println("Enter course name:");
                String courseName = scanner.nextLine();
                Course course = new Course(courseName, null, null, 0); // Placeholder, assign teacher and duration later
                studentCourses.add(course);
                courses.add(course); // Add course to the main course list
            }

            students.add(new Student(studentName, studentCourses));
        }

        // Input administration constraints
        System.out.println("Enter number of constraints:");
        int numConstraints = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numConstraints; i++) {
            System.out.println("Enter constraint description:");
            String description = scanner.nextLine();
            System.out.println("Enter constraint priority (higher value means higher priority):");
            int priority = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            constraints.add(new Constraint(description, priority));
        }

        Administration administration = new Administration("University Administration", constraints);

        // Define pairwise comparison matrix for AHP (example matrix, should be input dynamically or calculated)
        double[][] pairwiseMatrix = {
            {1, 3, 4},
            {1.0/3, 1, 2},
            {1.0/4, 1.0/2, 1}
        };

        AHP ahp = new AHP(pairwiseMatrix);

        // Generate schedule
        Schedule schedule = new Schedule(courses, teachers, students, ahp);
        schedule.generate();
        schedule.printSchedule();

        scanner.close();
    }
}
