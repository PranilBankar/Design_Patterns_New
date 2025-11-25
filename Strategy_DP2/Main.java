package Strategy_DP2;
interface TravelStrategy{
    public void travel();
}
class CarTravel implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("Traveling by Car");
    }
}

class TrainTravel implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("Traveling by Train");
    }
}

class FlightTravel implements TravelStrategy{
    @Override 
    public void travel(){
        System.out.println("Traveling by FLight");
    }
}

class TravelContext{
    private TravelStrategy Trav;
    public void setTravelStrategy(TravelStrategy Trav){
        this.Trav=Trav;
    }
    public void executeTravel(){
        Trav.travel();
    }
}
public class Main {
    public static void main(String[] args) {
        TravelContext context = new TravelContext();

        context.setTravelStrategy(new CarTravel());
        context.executeTravel();

        context.setTravelStrategy(new TrainTravel());
        context.executeTravel();

        context.setTravelStrategy(new FlightTravel());
        context.executeTravel();
    }
}
