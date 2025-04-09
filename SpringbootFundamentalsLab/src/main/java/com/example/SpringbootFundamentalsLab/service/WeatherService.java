package com.example.SpringbootFundamentalsLab.service;

import org.springframework.stereotype.Service;
import java.util.Random;
import java.util.List;

// service that handles weather info
@Service
public class WeatherService {

    // list of weather conditions that are fixed, they don't change and they selected randomly
    private final Random random = new Random();
    private final List<String> conditions = List.of("Sunny 🛹", "Rainy 😭", "Cloudy 😶‍🌫️", "Windy 🌬️");

    // returns a random temp between -10 an 40
    public int getCurrentTemperature() {
        return random.nextInt(51) - 10; // -10 to 40
    }

    // returns a random weather condition
    public String getCurrentCondition() {
        return conditions.get(random.nextInt(conditions.size()));
    }

    // returns a random wind speed from 0 to 100 km/h
    public int getCurrentWindSpeed() {
        return random.nextInt(101); // 0 to 100
    }

    // returns all weather info in one call
    public String getAllWeatherInfo() {
        return "Temperature is: " + getCurrentTemperature() + "°C, " +
                "The weather is: " + getCurrentCondition() + ", " +
                "Wind Speed estimated: " + getCurrentWindSpeed() + " km/h";
    }
}