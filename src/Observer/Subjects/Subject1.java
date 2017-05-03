package Observer.Subjects;

import Observer.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FAB3659 on 5/3/2017.
 */
public class Subject1 implements Subject {
    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        this.subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        this.subscribers.forEach(subs->subs.update());
    }
}
