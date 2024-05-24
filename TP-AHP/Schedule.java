import java.util.List;

public class Schedule {
    private List<Course> courses;
    private List<Teacher> teachers;
    private List<Student> students;
    private AHP ahp;

    public Schedule(List<Course> courses, List<Teacher> teachers, List<Student> students, AHP ahp) {
        this.courses = courses;
        this.teachers = teachers;
        this.students = students;
        this.ahp = ahp;
    }

    public void generate() {
        // Simple scheduling logic to assign courses based on preferences
        // and constraints
        for (Course course : courses) {
            for (Teacher teacher : teachers) {
                // Check teacher preferences
                for (Preference pref : teacher.getPreferences()) {
                    if (course.getTeacher() == null && course.getSchedule() == null) {
                        String schedule = pref.getDay() + " " + pref.getStartTime() + "-" + pref.getEndTime();
                        course.setSchedule(schedule);
                        course.setTeacher(teacher);
                        break;
                    }
                }
            }
        }
    }

    public void printSchedule() {
        System.out.println("\nGenerated Schedule:");
        for (Course course : courses) {
            System.out.println("Course: " + course.getName() +
                    ", Teacher: " + course.getTeacher().getName() +
                    ", Schedule: " + course.getSchedule());
        }
    }
}
