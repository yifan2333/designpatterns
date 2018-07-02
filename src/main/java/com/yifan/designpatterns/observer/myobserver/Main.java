package com.yifan.designpatterns.observer.myobserver;

/**
 * @author wuyifan
 * @since 2018年01月10日
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(70, 90, 29.2f);
    }
}
