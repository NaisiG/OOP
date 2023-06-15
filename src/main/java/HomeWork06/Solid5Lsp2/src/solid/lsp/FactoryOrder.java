package HomeWork06.Solid5Lsp2.src.solid.lsp;

public class FactoryOrder {
    public OrderAbstract create(int price, int qnt, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(price, qnt);
        }
        return new Order(price, qnt);
    }
}
