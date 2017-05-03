package Observer.Subjects;

import Observer.Observers.Observer;

/**
 * Created by FAB3659 on 5/3/2017.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
