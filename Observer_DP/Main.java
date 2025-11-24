
public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel("PCodes");

        Subscriber sub1 = new Subscriber("Alice");
        Subscriber sub2 = new Subscriber("Bob");
        Subscriber sub3 = new Subscriber("Pranil");
        Subscriber sub4 = new Subscriber("Paras");

        channel.subscribe(sub1);
        channel.subscribe(sub2);
        channel.subscribe(sub3);
        channel.subscribe(sub4);

        channel.uploadVideo("Observer Design Pattern Tutorial");
    }
}
