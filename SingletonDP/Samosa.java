// Lazy Way of creating Singleton Design Pattern.
// Thread Saftey implemented with Double Checking.
public class Samosa {
    // Private Constructor
//    private Samosa() {
//     }
   private static Samosa instance;
   public static Samosa getInstance() {
       if (instance == null) {
        synchronized (Samosa.class) {
          //  if (instance==null) {
                instance = new Samosa();
            }
       // }
       }
       return instance;
   }
}