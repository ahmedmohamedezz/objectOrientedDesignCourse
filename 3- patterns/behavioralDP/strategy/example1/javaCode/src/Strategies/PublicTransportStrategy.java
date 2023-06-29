package Strategies;

import Strategies.RoutingStrategies;

public class PublicTransportStrategy implements RoutingStrategies {
    @Override
    public void execute(){
        System.out.println("Public Transport Strategy Applied");
    }
}
