package State_DP;

public class Package {
    private PackageState state;
    public Package() {
        state=new OrderState();
    }
    public void setState(PackageState state) {
        this.state = state;
    }
    public PackageState getState(){
        return state;
    }
    public void nextState(){
        state.next(this);
    }
    public void prevState(){
        state.prev(this);
    }
    public void printState(){
        state.printState();
    }

}
