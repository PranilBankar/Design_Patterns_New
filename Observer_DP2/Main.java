import java.util.*;

// 1. Observer interface
interface Observer {
    void update(String message);
}

// 2. Subject interface
interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}

// 3. Concrete Subject
class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void setNews(String news) {
        this.news = news;
        notifyObservers();  // state changed → notify
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(news);
        }
    }
}

// 4. Concrete Observer
class NewsChannel implements Observer {
    private String news;

    public void update(String news) {
        this.news = news;
        System.out.println("NewsChannel received: " + news);
    }
}
class NewsMarket implements Observer{
    private String news;
     public void update(String news){
        this.news=news;
        System.out.println("NewsMarket Recieved:" +news);
     }
}
// Demo
public class Main{
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsMarket channel2 = new NewsMarket();

        agency.attach(channel1);
        agency.attach(channel2);

        agency.setNews("Breaking News: Observer Pattern!");
        // Both channel1 and channel2 get notified automatically
    }
}
