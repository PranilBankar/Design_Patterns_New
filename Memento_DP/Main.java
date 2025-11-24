// Memento: stores the state
import java.util.*;

class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// Originator: creates and restores mementos
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Current State: " + state);
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("State restored to: " + state);
    }
}

// Caretaker: keeps track of saved states
class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("\n--- Restoring previous states ---");
        originator.getStateFromMemento(caretaker.get(0)); // restore State #2
        originator.getStateFromMemento(caretaker.get(1)); // restore State #3
    }
}
