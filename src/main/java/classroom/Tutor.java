package classroom;

public class Tutor implements Staff{
    private String name;
    public Tutor(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void markGrade() {
        System.out.println("Grade is marked by " + getName());
    }
}

