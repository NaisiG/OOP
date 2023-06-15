package Seminary.SM07.DecoratorFactory.src.calculator;

public class LogCalculableFactory implements ICalculableFactory {
    Logger logger;
    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
