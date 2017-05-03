package Observer.Observers;

import Observer.Subjects.Subject;
import Observer.Subjects.WeatherData;

/**
 * Created by FAB3659 on 5/3/2017.
 */
public class ForecastDisplay implements Observer, Display {

    Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
    }

    @Override
    public void display() {

    }
}
