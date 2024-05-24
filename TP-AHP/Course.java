import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private List<Student> students;
    private int duration; // in hours
    private String schedule; // For simplicity, use a string like "Monday 9-11"

    public Course(String name, String schedule, List<Student> students, int duration) {
        this.duration = duration;
        this.name = name;
        this.schedule = schedule;
        this.students = students;
        this.teacher = teacher;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
