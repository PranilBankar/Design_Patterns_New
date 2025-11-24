package Abstract_FactoryMethod;

interface Tube {
    void material();
}

class MetalTube implements Tube {
    @Override
    public void material() {
        System.out.println("Tube material: Metal");
    }
}

class FibreTube implements Tube {
    @Override
    public void material() {
        System.out.println("Tube material: Fibre");
    }
}
