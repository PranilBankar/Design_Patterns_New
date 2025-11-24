package BuilderPhone_Method;
public interface Builder {
    Builder setBrand(String brand);
    Builder setModel(String model);
    Builder setRam(int ram);
    Builder setStorage(int storage);
    Builder setIs5GEnabled(boolean is5GEnabled);
    Phone build();
}
