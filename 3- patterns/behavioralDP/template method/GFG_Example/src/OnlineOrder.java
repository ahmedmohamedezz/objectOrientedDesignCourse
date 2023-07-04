public class OnlineOrder extends OrderingProcessTemplate{
    public OnlineOrder(boolean gift){
        this.isGift = gift ;
    }
    @Override
    protected void chooseItems() {
        System.out.println("items are chosen from list , and added to order");
    }

    @Override
    protected void pay() {
        System.out.println("pay with credit card");
    }

    @Override
    protected void deliver() {
        System.out.println("order will be sent to location specified");
    }
}
