package com.company.moviebooking.controller;

import com.company.moviebooking.model.RunningMovie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowController {

    @PostMapping("/addShow")
    public void addShow(@RequestBody List<RunningMovie> runningMovies) {
    }

    @PutMapping("/updateShow")
    public void updateShow(@RequestBody List<RunningMovie> runningMovies) {
    }

    @DeleteMapping("/deleteShow")
    public void deleteShow(@RequestBody List<RunningMovie> runningMovies) {

    }

}
