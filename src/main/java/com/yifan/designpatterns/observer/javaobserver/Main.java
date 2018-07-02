package com.yifan.designpatterns.observer.javaobserver;

import java.util.Observable;

/**
 * @author wuyifan
 * @since 2018年01月11日
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        GeneralDisplay display = new GeneralDisplay(weatherData);
        weatherData.setMeasurements(10,20,12);
        weatherData.setMeasurements(11,21,13);
    }
}
