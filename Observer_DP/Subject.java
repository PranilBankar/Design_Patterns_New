package Observer_DP;

public interface Subject {
    void subscribe(Oser subscriber);
    void unsubscribe(Oser subscriber);
    void notifySubscribers();
    void uploadVideo(String videoTitle);
}
