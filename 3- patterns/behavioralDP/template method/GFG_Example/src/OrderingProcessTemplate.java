public abstract class OrderingProcessTemplate {
    protected boolean isGift ;
    // steps for purchasing an order
    // 1. choose items
    // 2. pay
    // 3. wrap them if it's a gift
    // 4. deliver them
    protected abstract void chooseItems() ;
    protected abstract void pay() ;
    protected void wrapGift(){
        if(isGift)
            System.out.println("Wrapping the gift");
    }
    protected abstract void deliver() ;

    // template method ( final => no subclass can override it
    public final void processOrder(){
        chooseItems();
        pay();
        wrapGift();
        deliver();
    }
}
