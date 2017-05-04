package Observer.Observers;

import Observer.Data.WeatherData;

/**
 * Created by FAB3659 on 5/3/2017.
 */
public interface Observer {

    public void update(WeatherData data);

}

