package TemplateMethodPattern.ex2;

public class TemplateMethodPatternClient {
    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();
        AbstractClass anotherConcreteClass = new AnotherConcreteClass();

        concreteClass.templateMethod();

        System.out.println("-------------------------");

        anotherConcreteClass.templateMethod();
    }
}
