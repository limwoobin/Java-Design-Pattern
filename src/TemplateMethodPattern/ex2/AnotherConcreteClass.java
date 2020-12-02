package TemplateMethodPattern.ex2;

public class AnotherConcreteClass extends AbstractClass {
    @Override
    protected void hook1() {
        System.out.println("ABSTRACT Another hook1 implementation");
    }

    @Override
    protected void hook2() {
        System.out.println("ABSTRACT Another hook2 implementation");
    }
}
