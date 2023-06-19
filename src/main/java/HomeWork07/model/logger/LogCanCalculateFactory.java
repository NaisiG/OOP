package HomeWork07.model.logger;

import HomeWork07.model.calculator.CanCalculate;
import HomeWork07.model.ComplexNumber;
import HomeWork07.model.calculator.ICanCalculateFactory;

public class LogCanCalculateFactory implements ICanCalculateFactory {

    Logger logger;

    public LogCanCalculateFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public CanCalculate create(ComplexNumber arg) {
        return new LogCalculator(arg, logger);
    }
}
