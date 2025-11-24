package Abstract_FactoryMethod;

interface Refil {
    void type();
}
class Plastic implements Refil {
    @Override
    public void type() {
        System.out.println("Refil type: Plastic");
    }
}
class Sponge implements Refil {
    @Override
    public void type() {
        System.out.println("Refil type: Sponge");
    }
}
