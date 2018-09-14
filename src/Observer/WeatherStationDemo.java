package Observer;

import Observer.Observers.CurrentDisplay;
import Observer.Observers.Monitor;
import Observer.Subjects.WeatherStation;

public class WeatherStationDemo {

    public static void main(String[] args){
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
