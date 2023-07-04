import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehiclesFactory factory = new VehiclesFactory() ;
        while(true){
            System.out.println("Enter the number of the vehicle you want , or -1 to stop");
            System.out.println("1. Car");
            System.out.println("2. Bus");
            System.out.println("3. Motor Cycle");
            Scanner input = new Scanner(System.in) ;
            int choice = input.nextInt() ;
            Vehicle v = factory.getVehicleFromFactory(choice) ;
            if(v==null)
                break;
            v.printInfo();
        }
    }
}