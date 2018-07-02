package com.yifan.designpatterns.observer.javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wuyifan
 * @since 2018年01月11日
 */
public class GeneralDisplay implements Observer,DisplayElement {

    private float temperature;

    private float humidity;

    private float pressure;

    private Observable observable;

    public GeneralDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "GeneralDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
