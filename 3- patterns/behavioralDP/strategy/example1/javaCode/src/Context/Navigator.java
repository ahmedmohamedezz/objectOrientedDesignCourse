package Context;

import Strategies.RoutingStrategies;

public class Navigator {
    private RoutingStrategies strategy ;
    public Navigator(){

    }
    public Navigator(RoutingStrategies obj){
        this.strategy = obj ;
    }
    public void setStrategy(RoutingStrategies obj){
        this.strategy = obj ;
    }
    public void execute(){
        strategy.execute();
    }
}
