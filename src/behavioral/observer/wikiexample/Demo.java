package behavioral.observer.wikiexample;

import behavioral.observer.wikiexample.observable.WeatherData;
import behavioral.observer.wikiexample.observer.CurrentConditionDisplay;

public class Demo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}
