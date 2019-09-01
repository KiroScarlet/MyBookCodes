package HeadFirstDesignPattern.chapter2;

import HeadFirstDesignPattern.chapter2.impl.CurrentConditionsDisplay;
import HeadFirstDesignPattern.chapter2.impl.WeatherData;

/**
 * @author KiroScarlet
 * @date 2019-09-01  -14:22
 * @title WeatherStation
 * @project MyBookCodes
 * @desc TODO
 */
public class WeatherStation {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);

        Thread.sleep(1000);

        weatherData.setMeasurements(82,70,29.2f);

        Thread.sleep(1000);

        weatherData.setMeasurements(78,90,29.2f);

    }
}
