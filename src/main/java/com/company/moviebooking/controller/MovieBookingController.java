package com.company.moviebooking.controller;

import com.company.moviebooking.model.Booking;
import com.company.moviebooking.model.Movie;
import com.company.moviebooking.model.RunningMovie;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import src.sapient.interview.moviebooking.model.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class MovieBookingController {

    @GetMapping("/cities")
    public List<String> getCities(){
        //TODO
        return null;
    }

    @GetMapping("/moviesByCity")
    public List<Movie> getMoviesByCity(@RequestParam String city ){
        //TODO
        return null;
    }

    @GetMapping("/moviesByLang")
    public List<Movie> getMoviesByLanguage(@RequestParam String language, @RequestParam String city ){
        //TODO
        return null;
    }

    @GetMapping("/moviesByGenre")
    public List<Movie> getMoviesByGenre(@RequestParam String genre, @RequestParam String city ){
        //TODO
        return null;
    }


    @GetMapping("/moviesByLangGenre")
    public List<Movie> getMoviesByLanguageAndGenre(@RequestParam String genre,@RequestParam String language, @RequestParam String city ){
        //TODO
        return null;
    }

    //Showtime
    @GetMapping("/showtime")
    public List<RunningMovie> getMovieShowtime(@RequestParam Long movieId, @RequestParam String city, @RequestParam  Optional<Long> theatreId, @RequestParam Optional<String> screenType, @RequestParam @DateTimeFormat(pattern="yyyyMMdd") Optional<LocalDate> movieDate ){
        //TODO
        return null;
    }

    @PostMapping("/bookTickets")
    public Long bookTickets(@RequestParam Booking booking ){
        //TODO
        return null;
    }

    @GetMapping("/bookingsByCust")
    public List<Booking> getBookingsByCustomerId(@RequestParam Long customerId) {
        return null;
    }

    @GetMapping("/bookingsById")
    public Booking getBookingsByBookingId(@RequestParam Long bookingId) {
        return null;
    }

}
