import java.util.ArrayList;
import java.util.List;

public class CompositeUnit implements EducationalUnit {
    private String name;
    private String type;
    private List<EducationalUnit> children = new ArrayList<>();

    public CompositeUnit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void add(EducationalUnit unit) { children.add(unit); }

    public void displayDetails(String indent) {
        System.out.println(indent + type + ": " + name);
        for (EducationalUnit unit : children) {
            unit.displayDetails(indent + "  ");
        }
    }

    public int getStudentCount() {
        return children.stream().mapToInt(EducationalUnit::getStudentCount).sum();
    }

    public double getBudget() {
        return children.stream().mapToDouble(EducationalUnit::getBudget).sum();
    }
}