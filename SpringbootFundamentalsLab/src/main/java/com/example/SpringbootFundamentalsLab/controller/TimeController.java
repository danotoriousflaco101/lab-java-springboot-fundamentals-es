package com.example.SpringbootFundamentalsLab.controller;

import com.example.SpringbootFundamentalsLab.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller that handles time info requests
@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    // constructor that initialize time service
    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    // returns time
    @GetMapping
    public String getTime() {
        return timeService.getCurrentTime();
    }

    // returs date
    @GetMapping("/date")
    public String getDate() {
        return timeService.getCurrentDate();
    }

    // returns day
    @GetMapping("/day")
    public String getDay() {
        return timeService.getCurrentDay();
    }

    // returns all time info in one call
    @GetMapping("/all")
    public String getAllTime() {
        return timeService.getAllTimeInfo();
    }
}
