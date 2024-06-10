import java.util.List;

public class Main {

    public static void main(String[] args) {
        Human ivan = new Human("Иван");
        Human olga = new Human("Ольга");
        Human sergo = new Human("Сергей");
        Human gena = new Human("Генадий");
        Human jonny = new Human("Джонни");

        Market walmart = new Market();

        walmart.acceptToMarket(List.of(ivan, olga, sergo, gena));

        walmart.giveOrders(ivan, List.of(EProduct.APPLE, EProduct.JUICE));
        walmart.giveOrder(olga, EProduct.SUGAR);

        walmart.update();

        walmart.releaseFromMarket(ivan);
        walmart.releaseFromMarket(olga);

        walmart.update();

        walmart.acceptToMarket(jonny);
        walmart.giveOrder(jonny, EProduct.MEAT);

        walmart.update();

        walmart.releaseFromMarket();

        walmart.update();
    }
}