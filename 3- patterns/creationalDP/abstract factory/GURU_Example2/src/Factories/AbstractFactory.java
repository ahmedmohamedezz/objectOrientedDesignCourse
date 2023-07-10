package Factories;

import Products.Chair;
import Products.Sofa;
import Products.Table;

public interface AbstractFactory {
    Chair getChair() ;
    Sofa getSofa() ;
    Table getTable() ;

}
