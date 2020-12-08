package TemplateCallback.ex1;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Calculator calculator = new Calculator();

        System.out.println(calculator.calcSum(numbers));
        System.out.println(calculator.calcMultiply(numbers));

        List<String> strings = Arrays.asList("A" , "B" , "C" , "D");
        System.out.println(calculator.concatenate(strings));
    }
}
