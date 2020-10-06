package BuilderPattern.ex1;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder().build();
        personBuilder.setAge(25)
                     .setName("name")
                     .setGender(Gender.MALE)
                     .setHeight(150)
                     .setWeight(80);

        System.out.println(personBuilder.toString());

    }
}
