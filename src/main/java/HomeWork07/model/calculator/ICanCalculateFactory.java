package HomeWork07.model.calculator;

import HomeWork07.model.ComplexNumber;

public interface ICanCalculateFactory {
    CanCalculate create(ComplexNumber arg);
}
