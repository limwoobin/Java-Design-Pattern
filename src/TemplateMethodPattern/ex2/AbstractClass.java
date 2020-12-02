package TemplateMethodPattern.ex2;

public abstract class AbstractClass {

    protected abstract void hook1();

    protected abstract void hook2();

    // 실제로 실행을 위해 호출될 public method
    public final void templateMethod() {
        hook1();
        hook2();
    }
}
