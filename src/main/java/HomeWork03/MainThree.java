package HomeWork03;

public class MainThree {
    public static void main(String[] args) {

        LinkedUnits<String> linkedUnits = new LinkedUnits<>();
        linkedUnits.add("стр 1");
        linkedUnits.add("стр 2");
        linkedUnits.add("стр 3");
        linkedUnits.add("стр 4");
        linkedUnits.add("стр 5");
        linkedUnits.add("стр 6");

        System.out.printf("Размер списка: %d\n", linkedUnits.size());

        System.out.println("---для каждого---");
        for (String value : linkedUnits) {
            System.out.println(value);
        }

        System.out.println("---удалить-индекс-3---");
        System.out.println(linkedUnits.remove(3));

        System.out.println("---задать-элемент-индекса-1--");
        linkedUnits.set("новое значение", 1);

        System.out.println("---получить-элементы-по-индексу---");
        for (int i = 0; i < linkedUnits.size(); i++) {
            System.out.println(linkedUnits.get(i));
        }

        System.out.println("---очистить---");
        linkedUnits.clear();
        System.out.printf("Размер списка: %d\n", linkedUnits.size());
    }
}
