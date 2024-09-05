package seminars.lesson007.ooppatterns.structural.wrappers.decorator.task.util;

import seminars.lesson007.ooppatterns.structural.wrappers.decorator.task.Calculable;

public class CalculatorDecorator implements Calculable {
    private Calculable calculable;//all classes that implement this interface could be in this constructor
    public CalculatorDecorator(Calculable calculable) {
        this.calculable = calculable;
    }
    @Override
    public void sum(double a, double b) {

    }

    @Override
    public void multiply(double a, double b) {

    }

    @Override
    public void divide(double a, double b) {

    }

    @Override
    public void subtraction(double a, double b) {

    }

    @Override
    public double result() {
        return 0;
    }

    @Override
    public void clear() {

    }
}
