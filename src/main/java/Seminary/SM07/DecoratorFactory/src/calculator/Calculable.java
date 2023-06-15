package Seminary.SM07.DecoratorFactory.src.calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    int getResult();
}
