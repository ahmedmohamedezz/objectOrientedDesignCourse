public class VehiclesFactory {
    public Vehicle getVehicleFromFactory(int type){
        switch (type){
            // note we don't need to break after any statement => already we terminate and return at choosing
            case 1 : return new Car() ;
            case 2 : return new Bus() ;
            case 3 : return new Motorcycle() ;
            default:return null ;
        }
    }
}
