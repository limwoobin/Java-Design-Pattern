package TemplateCallback.ex2;

public class Calculator<T> {

    public String sum() {
        CalculatorCallback<Integer> callback = new CalculatorCallback<Integer>() {
            @Override
            public Integer calculate(Integer a, Integer b) {
                return a + b;
            }
        };

        return this.toString((T) callback.calculate(5 , 5));
    }

    public String multiply() {
        CalculatorCallback<Integer> callback = new CalculatorCallback<Integer>() {
            @Override
            public Integer calculate(Integer a, Integer b) {
                return a * b;
            }
        };

        return this.toString((T) callback.calculate(3 , 6));
    }

    public String divide() {
        CalculatorCallback<Double> callback = new CalculatorCallback<Double>() {
            @Override
            public Double calculate(Double a, Double b) {
                return a / b;
            }
        };

        return this.toString((T) callback.calculate(5.0 , 2.0));
    }

    public String toString(T data) {
        return String.valueOf(data);
    }
}
