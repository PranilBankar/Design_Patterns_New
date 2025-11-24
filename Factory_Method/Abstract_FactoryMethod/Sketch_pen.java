class Sketch_pen implements Pen_Factory {
    @Override
    public Tube createTube() {
        return new FibreTube(); // Sketch pen typically uses a fibre tube
    }
    @Override
    public Refil createRefill() {
        return new Sponge(); // Sketch pen typically uses a sponge refil
    }
}
