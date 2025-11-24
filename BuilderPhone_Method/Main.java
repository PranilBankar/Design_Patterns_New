package BuilderPhone_Method;
public class Main {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                        .setBrand("Apple")
                        .setModel("iPhone 15 Pro")
                        .setRam(8)
                        .setStorage(256)
                        .setIs5GEnabled(true)
                        .build();

        System.out.println(phone);
    }
}
