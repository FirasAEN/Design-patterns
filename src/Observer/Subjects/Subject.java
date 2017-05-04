package Observer.Subjects;

import Observer.Observers.Monitor;

/**
 * Created by FAB3659 on 5/3/2017.
 */
public interface Subject {

    public void registerObserver(Monitor o);

    public void removeObserver(Monitor o);

    public void notifyObservers();
}
