package com.example.SpringbootFundamentalsLab.service;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

// service that handles time info
@Service
public class TimeService {

    // returns time
    public String getCurrentTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    // returns data (day - month - year)
    public String getCurrentDate() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // returns day
    public String getCurrentDay() {
        return DayOfWeek.from(LocalDate.now()).toString();
    }

    // returns all time info in one call
    public String getAllTimeInfo() {
        return "Time: " + getCurrentTime() + ", " +
                "Date: " + getCurrentDate() + ", " +
                "Day: " + getCurrentDay();
    }
}
