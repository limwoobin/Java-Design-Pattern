package TemplateCallback.ex1;

import java.util.List;

public class Calculator {
    private StringBuilder builder;

    public int calcSum(List<Integer> list) {
        CalculatorCallback<Integer> sumCallback = new CalculatorCallback<Integer>() {
            @Override
            public Integer doSomethingData(Integer result, Integer value) {
                return result + value;
            }
        };

        return doCalcTemplate(list , sumCallback , 0);
    }

    public int calcMultiply(List<Integer> list) {
        CalculatorCallback<Integer> multiplyCallback = new CalculatorCallback<Integer>() {
            @Override
            public Integer doSomethingData(Integer result, Integer value) {
                return result * value;
            }
        };

        return doCalcTemplate(list , multiplyCallback , 1);
    }

    public String concatenate(List<String> list) {
        CalculatorCallback<String> concatCallback = new CalculatorCallback() {
            @Override
            public String doSomethingData(Object result, Object value) {
                builder = new StringBuilder(String.valueOf(result));
                return String.valueOf(builder.append(value));
            }
        };

        return doCalcTemplate(list , concatCallback , "");
    }

    private <T> T doCalcTemplate(List<T> list , CalculatorCallback<T> callback , T initValue) {
        T result = initValue;
        for (T t : list) {
            result = callback.doSomethingData(result , t);
        }

        return result;
    }
}
