package Observer_DP;
// Observing entity.
// Subscriber class that gets notified of updates from the Channel (Subject).
class Subscriber implements Oser{
   private String name;
   private Channel channel= new Channel("PCodes");
   public Subscriber(String name) {
    super();
       this.name = name;
     //  this.channel = channel;
   }
   @Override
   public void update(){
         System.out.println("Hey "+name+", New video uploaded in channel "+channel.getName());
   }

}
