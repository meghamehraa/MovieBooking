package com.company.moviebooking.service;

import com.company.moviebooking.dao.MovieBookingDao;
import com.company.moviebooking.model.RunningMovie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
public class MovieBookingServiceImpl implements MovieBookingService{

    MovieBookingDao movieBookingDao;

    @Autowired
    public MovieBookingServiceImpl(MovieBookingDao movieBookingDao) {
        this.movieBookingDao = movieBookingDao;
    }

    //Browse theatres currently running the show (movie selected) in the town, including show timing by a chosen date
    public List<RunningMovie> getMovieShowtime(Long movieId, String city, LocalDate movieDate ){
        try{
            return movieBookingDao.getMovieShowtime(movieId, city, movieDate);
        }catch(Exception ex){
            log.error("Error while fetching Movie showtimes for city:{}, movie:{}, date:{}",city,movieId,movieDate);
            //TODO: Handle exception
            return null;
        }
    }

}
