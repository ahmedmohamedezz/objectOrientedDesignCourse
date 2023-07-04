public class Main {
    public static void main(String[] args) {
        OrderingProcessTemplate netOrder = new OnlineOrder(false) ;
        netOrder.processOrder();

        System.out.println();

        OrderingProcessTemplate marketOrder = new MarketOrder(true) ;
        marketOrder.processOrder();
    }
}