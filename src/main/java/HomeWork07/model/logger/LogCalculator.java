package HomeWork07.model.logger;

import HomeWork07.model.calculator.Calculator;
import HomeWork07.model.calculator.CanCalculate;
import HomeWork07.model.ComplexNumber;

public class LogCalculator implements CanCalculate {

    Calculator calculator;
    Logger logger;

    public LogCalculator(ComplexNumber arg, Logger logger) {
        this.calculator = new Calculator(arg);
        this.logger = logger;
        logger.log("первый аргумент - " + arg + '\n');
    }

    @Override
    public void sum(ComplexNumber number) {
        logger.log("сумма " + number + '\n');
        calculator.sum(number);
    }

    @Override
    public void multiply(ComplexNumber number) {
        logger.log("умножение " + number + '\n');
        calculator.multiply(number);
    }

    @Override
    public void subtract(ComplexNumber number) {
        logger.log("вычитание " + number + '\n');
        calculator.subtract(number);
    }

    public void divide(ComplexNumber number) {
        logger.log("деление " + number + '\n');
        calculator.divide(number);
    }

    @Override
    public ComplexNumber result() {
        ComplexNumber result = calculator.result();
        logger.log("результат - " + result + '\n');
        return result;
    }
}
