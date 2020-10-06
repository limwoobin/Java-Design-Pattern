package BuilderPattern.ex1;

public class PersonBuilder {
    private String name;
    private int age;
    private Gender gender;
    private double height;
    private double weight;

    public PersonBuilder() {

    }

    public PersonBuilder(String name , int age , Gender gender , double height , double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public PersonBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public PersonBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public PersonBuilder build() {
        PersonBuilder personBuilder = new PersonBuilder(name , age , gender , height , weight);
        return personBuilder;
    }


    @Override
    public String toString() {
        return "PersonBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}


enum Gender {
    MALE,
    FEMALE;
}