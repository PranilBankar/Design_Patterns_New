package Abstract_FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Pen_Factory gelPenFactory = new Gel_Pen();
        Pen gelPen = new GelPen(gelPenFactory);
        gelPen.write();

        System.out.println();

        Pen_Factory sketchPenFactory = new Sketch_Pen();
        Pen sketchPen = new SketchPen(sketchPenFactory);
        sketchPen.write();
    }
}
