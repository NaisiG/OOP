package HomeWork06.Solid5Lsp2.src.solid.lsp;

public class Order extends OrderAbstract {

    public Order(int price, int qnt) {
        super(price, qnt);
    }

    public int getAmount() {
        return super.qnt * super.price;
    }
}
