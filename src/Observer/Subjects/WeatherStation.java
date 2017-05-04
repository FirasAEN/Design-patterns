package Observer.Subjects;

import Observer.Data.WeatherData;
import Observer.Observers.Monitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FAB3659 on 5/3/2017.
 */
public class WeatherStation implements Subject {
    private WeatherData data;
    private List<Monitor> displays;
    private Boolean isChanged = Boolean.FALSE;

    public WeatherStation() {
        this.displays = new ArrayList<>();
        this.data = new WeatherData();
    }

    public WeatherStation(WeatherData data) {
        this.displays = new ArrayList<>();
        this.data = data;
    }

    @Override
    public void registerObserver(Monitor o) {
        this.displays.add(o);
        displays.get(displays.indexOf(o)).update(this.data);
    }

    @Override
    public void removeObserver(Monitor o) {
        int position = displays.indexOf(o);
        if(position >=0)  displays.remove(position);
    }

    @Override
    public void notifyObservers() {
        this.displays.forEach(observer -> observer.update(this.data));
    }

    public void printDisplays(){
        this.displays.forEach(display -> display.display());
    }

    public void setChanged(){
        this.isChanged = Boolean.TRUE;
    }

    public void measurementsChanged(){
        if (isChanged){
            notifyObservers();
        }
    }

    public WeatherData getData() {
        return data;
    }
}
