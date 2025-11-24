package BuilderPhone_Method;
public class PhoneBuilder implements Builder {
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private boolean is5GEnabled;

    @Override
    public Builder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Builder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public Builder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public Builder setIs5GEnabled(boolean is5GEnabled) {
        this.is5GEnabled = is5GEnabled;
        return this;
    }

    @Override
    public Phone build() {
        return new Phone(brand, model, ram, storage, is5GEnabled);
    }
}
