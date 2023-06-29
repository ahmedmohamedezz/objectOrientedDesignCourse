import Context.Navigator;
import Strategies.PublicTransportStrategy;
import Strategies.RidingStrategy;
import Strategies.RoutingStrategies;
import Strategies.WalkingStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RoutingStrategies strategy ;
        Navigator navigator = new Navigator();
        int choice ;
        while(true){
            System.out.println("choose the strategy you want , or -1 to break");
            System.out.println("1. Walking");
            System.out.println("2. Riding");
            System.out.println("3. Public Transport");
            System.out.println("Or -1 To Break");
            Scanner input = new Scanner(System.in) ;
            choice = input.nextInt() ;
            if(choice==-1)
                break;
            else{
                switch (choice){
                    case 1 : strategy = new WalkingStrategy() ;
                    break;
                    case 2 : strategy = new RidingStrategy() ;
                    break;
                    case 3 : strategy = new PublicTransportStrategy() ;
                    break;
                    default: strategy = new WalkingStrategy(); // to avoid compilation error ( object may not be assigned )
                }
                navigator.setStrategy(strategy);
                navigator.execute();
            }
        }
    }
}