
// This will act as the Subject in the Observer Design Pattern.
import java.util.ArrayList;
import java.util.List;

import Observer_DP.Oser;
public class Channel implements Subject {
    private String name;
    private List<Oser> subscribers = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println("Video '" + videoTitle + "' uploaded to channel " + name);
        notifySubscribers();
    }
}
