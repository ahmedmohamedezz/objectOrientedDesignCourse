package Factories;

import Products.*;

public class VectorianFactory implements AbstractFactory{
    @Override
    public Chair getChair(){
        return new VectorianChair() ;
    }
    @Override
    public Sofa getSofa(){
        return new VectorianSofa() ;
    }
    @Override
    public Table getTable(){
        return new VectorianTable() ;
    }
}
