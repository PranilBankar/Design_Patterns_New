package State_DP;

public class DeliveryState implements PackageState {
    @Override
    public void next(Package pkg){
        System.out.println("The package has been delivered.");
    }
    @Override
    public void prev(Package pkg){
        pkg.setState(new ShippedState());
    }
    @Override
    public void printState(){
        System.out.println("Package out for delivery.");
    }
}
