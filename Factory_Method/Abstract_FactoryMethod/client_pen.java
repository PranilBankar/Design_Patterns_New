 package Abstract_FactoryMethod;

abstract class Pen {
    protected Tube tube;
    protected Refil refill;

    public Pen(Pen_Factory factory) {
        tube = factory.createTube();
        refill = factory.createRefill();
    }

    public abstract void write();
}

class GelPen extends Pen {
    public GelPen(Pen_Factory factory) {
        super(factory);
    }

    public void write() {
        System.out.println("This is a Gel Pen.");
        tube.material();
        refill.type();
    }
}

class SketchPen extends Pen {
    public SketchPen(Pen_Factory factory) {
        super(factory);
    }

    public void write() {
        System.out.println("This is a Sketch Pen.");
        tube.material();
        refill.type();
    }
}
