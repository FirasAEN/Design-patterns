package Observer.Subjects;

import Observer.Observers.CurrentDisplay;
import Observer.Observers.Monitor;
import org.junit.Test;

/**
 * Created by FAB3659 on 5/4/2017.
 */
public class WeatherStationTest {

    @Test
    public void testWeatherStation(){
        Monitor currDisplay = new CurrentDisplay();

        WeatherStation station = new WeatherStation();
        station.getData().setTemperature(35.6);
        station.getData().setPressure(1.005);
        station.getData().setWindSpeed(7.2);

        station.registerObserver(currDisplay);
        station.printDisplays();

        station.removeObserver(currDisplay);

    }

}