package Factories;

import Products.*;

public class ModernFactory implements AbstractFactory{
    @Override
    public Chair getChair(){
        return new ModernChair() ;
    }
    @Override
    public Sofa getSofa(){
        return new ModernSofa() ;
    }
    @Override
    public Table getTable(){
        return new ModernTable() ;
    }

}
