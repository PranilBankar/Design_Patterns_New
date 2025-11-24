package State_DP;

public class OrderState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new ShippedState());
    }
    @Override
    public void prev(Package pkg){
        System.out.println("The package is in its initial state."); 
    }
    @Override
    public void printState(){
        System.out.println("Package ordered, not shipped yet.");
    }
}
