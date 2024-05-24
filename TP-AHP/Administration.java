import java.util.List;

public class Administration {
    private String name;
    private List<Constraint> constraints;

    public Administration(String name, List<Constraint> constraints) {
        this.name = name;
        this.constraints = constraints;
    }

    public String getName() {
        return name;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }
}
