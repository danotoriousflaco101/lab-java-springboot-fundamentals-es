package com.example.SpringbootFundamentalsLab.controller;

import com.example.SpringbootFundamentalsLab.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller that handles weather info requests
@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    // constructor
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    // returns temperature
    @GetMapping("/temperature")
    public int getTemperature() {
        return weatherService.getCurrentTemperature();
    }

    // returns weather conditions
    @GetMapping("/condition")
    public String getCondition() {
        return weatherService.getCurrentCondition();
    }

    // returns wind speed
    @GetMapping("/wind")
    public int getWindSpeed() {
        return weatherService.getCurrentWindSpeed();
    }

    // returns all weather info
    @GetMapping("/all")
    public String getAllWeather() {
        return weatherService.getAllWeatherInfo();
    }
}