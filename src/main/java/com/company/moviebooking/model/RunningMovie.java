package com.company.moviebooking.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RunningMovie {

    private String runningMovieId;

    private String movieId;

    private String theatreId;

    private String screenId;

    private LocalDateTime showTime;

    private String language;

}
