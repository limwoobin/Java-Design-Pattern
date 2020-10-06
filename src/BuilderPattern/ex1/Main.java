package BuilderPattern.ex1;

public class Main {
    public static void main(String[] args) {
        // ex1
        PersonBuilder personBuilder = new PersonBuilder().build();
        personBuilder.age(25)
                     .name("name")
                     .gender(Gender.MALE)
                     .height(150)
                     .weight(80);

        System.out.println(personBuilder.toString());

        // ex2
        PersonBuilder personBuilder2 = new PersonBuilder().build()
                                                          .gender(Gender.FEMALE)
                                                          .age(30);

        System.out.println(personBuilder2.toString());


        // ----------------------------------------------------------------------------------

        // ex1
        NutritionFacts.Builder builder = new NutritionFacts.Builder(240,8);
        builder.calories(50)
               .fat(30)
               .carbohydrate(40)
               .sodium(100)
               .build();

        System.out.println(builder.toString());

        // ex2
        NutritionFacts.Builder builder2 = new NutritionFacts.Builder(100 , 50)
                                                            .calories(50)
                                                            .fat(30)
                                                            .carbohydrate(10);

        System.out.println(builder2.toString());

        // ex3
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(50 , 100)
                                                           .fat(1000)
                                                           .build();

        System.out.println(nutritionFacts.toString());
    }
}
