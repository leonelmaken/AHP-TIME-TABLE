import java.util.List;

public class Teacher {
    private String name;
    private List<Preference> preferences;

    public Teacher(String name, List<Preference> preferences) {
        this.name = name;
        this.preferences = preferences;
    }

    public String getName() {
        return name;
    }

    public List<Preference> getPreferences() {
        return preferences;
    }
}
