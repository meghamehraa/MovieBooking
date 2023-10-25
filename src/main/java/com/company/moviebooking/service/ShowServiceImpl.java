package com.company.moviebooking.service;

import com.company.moviebooking.model.RunningMovie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.company.moviebooking.dao.ShowDao;

import java.util.List;

@Service
@Slf4j
public class ShowServiceImpl {

    ShowDao showDao;

    @Autowired
    public ShowServiceImpl(ShowDao showDao) {
        this.showDao = showDao;
    }

    //Add Show UI
    //MovieId  - Dropdown
    //language - Dropdown
    //TheatreId - Dropdown
    //TheatreScreenId - DropDown
    //showtime - DateSelector

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
