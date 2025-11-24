package State_DP;

public class ShippedState implements PackageState {
    @Override
    public void next(Package pkg){
        pkg.setState(new DeliveryState());
    }
    @Override
    public void prev(Package pkg){

        pkg.setState(new OrderState());
    }
    @Override
    public void printState(){
        System.out.println("Package shipped, in transit.");
    }   
}
