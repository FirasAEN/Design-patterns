package Observer.Subjects;

import Observer.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FAB3659 on 5/3/2017.
 */
public class WeatherData implements Subject {
    List<Observer> displays = new ArrayList<>();



    @Override
    public void registerObserver(Observer o) {
        this.displays.add(o);
        displays.get(displays.indexOf(o)).update();
    }

    @Override
    public void removeObserver(Observer o) {
        displays.remove(displays.indexOf(o));
    }

    @Override
    public void notifyObservers() {
        this.displays.forEach(display -> display.update());
    }
}
