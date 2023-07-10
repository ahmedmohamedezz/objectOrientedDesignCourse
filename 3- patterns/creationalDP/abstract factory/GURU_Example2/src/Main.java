import Factories.AbstractFactory;
import Factories.FrenchFactory;
import Factories.ModernFactory;
import Factories.VectorianFactory;
import Products.Chair;
import Products.Sofa;
import Products.Table;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("What type of furniture do you prefer ? , OR enter -1 to exit");
            System.out.println("1. Modern Style");
            System.out.println("2. Vectorian Style");
            System.out.println("3. French Style");
            Scanner input = new Scanner(System.in) ;
            int choice = input.nextInt() ;
            AbstractFactory factory ;
            switch (choice){
                case 1 : factory = new ModernFactory() ;
                break;
                case 2 : factory = new VectorianFactory() ;
                break;
                case 3 : factory = new FrenchFactory() ;
                break;
                case -1 : return;
                default:
                    throw new RuntimeException("Invalid Style") ;
            }
            Chair chair = factory.getChair() ;
            Sofa sofa = factory.getSofa() ;
            Table table = factory.getTable() ;

            chair.printDescription();
            sofa.printDescription();
            table.printDescription();
        }
    }
}