package Observer.Subjects;

import Observer.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FAB3659 on 5/3/2017.
 */
public class WeatherData implements Subject {
    private List<Observer> displays;

    public WeatherData() {
        this.displays = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.displays.add(o);
        displays.get(displays.indexOf(o)).update();
    }

    @Override
    public void removeObserver(Observer o) {
        int position = displays.indexOf(o);
        if(position >=0)  displays.remove(position);
    }

    @Override
    public void notifyObservers() {
        this.displays.forEach(observer -> observer.update());
    }

    public void measurementsChanged(){
        notifyObservers();
    }
}
