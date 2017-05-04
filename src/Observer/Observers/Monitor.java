package Observer.Observers;

import Observer.Data.WeatherData;

/**
 * Created by FAB3659 on 5/4/2017.
 */
public abstract class Monitor implements Display, Observer{
    private WeatherData data;

    @Override
    public void update(WeatherData data) {
        this.data = data;
    }

    @Override
    public void display() {
        System.out.println("Temperature : "+ data.getTemperature()+ data.TEMPERATURE);
        System.out.println("Pressure : "+ data.getPressure()+ data.PRESSURE);
        System.out.println("Wind Speed : "+ data.getWindSpeed()+ data.WIND_SPEED);
    }
}
