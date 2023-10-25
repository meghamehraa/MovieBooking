package com.company.moviebooking.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Booking {

    private Long bookingId;

    private Long customerId;

    private Long runningMovieId;

    //seat plan
    private String bookingDetails;


}
