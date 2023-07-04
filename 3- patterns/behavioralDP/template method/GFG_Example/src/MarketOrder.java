public class MarketOrder extends OrderingProcessTemplate{
    public MarketOrder(boolean gift){
        this.isGift = gift ;
    }
    @Override
    protected void chooseItems() {
        System.out.println("items are chosen from shelf");
    }

    @Override
    protected void pay() {
        System.out.println("pay cash");
    }

    @Override
    protected void deliver() {
        System.out.println("order is given to client");
    }
}
