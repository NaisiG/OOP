package HomeWork07.model.calculator;

import HomeWork07.model.ComplexNumber;

public class CanCalculateFactory implements ICanCalculateFactory {
    public CanCalculate create(ComplexNumber arg) {
        return new Calculator(arg);
    }
}
