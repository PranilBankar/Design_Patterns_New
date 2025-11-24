package Strategy_DP;
public class Vehicle {
    driveStrategy obj;
    // Constructor Injection
    public Vehicle(driveStrategy obj) {
        this.obj = obj;
    }
    public void drive(){
        obj.drive();
    }
}
