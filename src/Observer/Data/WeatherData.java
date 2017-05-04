package Observer.Data;

/**
 * Created by FAB3659 on 5/4/2017.
 */
public class WeatherData {
    public static final String TEMPERATURE = " (degC) ";
    public static final String PRESSURE = " (bar) ";
    public static final String WIND_SPEED = " (m/s) ";

    private Double temperature;
    private Double pressure;
    private Double windSpeed;

    public WeatherData() {
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }
}
