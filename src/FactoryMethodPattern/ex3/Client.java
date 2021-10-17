package FactoryMethodPattern.ex3;

public class Client {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("B");
        classA.createType("D");
    }
}


/*
어떤 상황에서 조건에 따라 객체를 다르게 생성해야 할 때가 있습니다.
예를 들면, 사용자의 입력값에 따라 하는 일이 달라질 경우, 분기를 통해 특정 객체를 생성해야 합니다.
객체마다 하는 일이 다르기 때문에 조건문에 따라 객체를 다르게 생성하는 것은 이상한 일이 아닙니다.

팩토리 메서드 패턴은 이렇게 분기에 따른 객체의 생성( new 연산자로 객체를 생성하는 부분 )을 직접하지 않고,
팩토리라는 클래스에 위임하여 팩토리 클래스가 객체를 생성하도록 하는 방식을 말합니다.
팩토리는 말 그대로 객체를 찍어내는 공장을 의미합니다.
 */