package BuilderPhone_Method;
public class Phone {
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private boolean is5GEnabled;

    public Phone(String brand, String model, int ram, int storage, boolean is5GEnabled) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.is5GEnabled = is5GEnabled;
    }

    @Override
    public String toString() {
        return "Phone [brand=" + brand + ", model=" + model + ", ram=" + ram +
               "GB, storage=" + storage + "GB, 5G=" + is5GEnabled + "]";
    }
}
