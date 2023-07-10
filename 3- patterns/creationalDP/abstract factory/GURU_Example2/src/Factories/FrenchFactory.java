package Factories;

import Products.*;

public class FrenchFactory implements AbstractFactory{
    @Override
    public Chair getChair(){
        return new FrenchChair() ;
    }
    @Override
    public Sofa getSofa(){
        return new FrenchSofa() ;
    }
    @Override
    public Table getTable(){
        return new FrenchTable() ;
    }
}
