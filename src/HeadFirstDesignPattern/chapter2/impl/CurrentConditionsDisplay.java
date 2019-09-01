package HeadFirstDesignPattern.chapter2.impl;

import HeadFirstDesignPattern.chapter2.DisplayElement;
import HeadFirstDesignPattern.chapter2.Observer;
import HeadFirstDesignPattern.chapter2.Subject;

/**
 * @author KiroScarlet
 * @date 2019-09-01  -14:16
 * @title CurrentConditionsDisplay
 * @project MyBookCodes
 * @desc TODO
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public String toString() {
        return "Current Conditions:" +
                temperature + "F degrees and " + humidity +
                "% humidity";
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
