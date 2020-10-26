package ProxyPattern.ex4;

public class NormalEmployee implements Employee {
    private String name;
    private Grade grade;

    public NormalEmployee(String name , Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Grade getGrade() {
        return grade;
    }

    @Override
    public String getInformation(Employee viewer) {
        return "Display" + getGrade().name() + " , " + getName() + " personnel information";
    }
}
