package Abstract_FactoryMethod;

class Gel_pen implements Pen_Factory {
    public Tube createTube() {
        return new MetalTube(); // Gel pen typically uses a metal tube
    }

    public Refil createRefil() {
        return new Plastic(); // Gel pen typically uses a plastic refil
    }
}
