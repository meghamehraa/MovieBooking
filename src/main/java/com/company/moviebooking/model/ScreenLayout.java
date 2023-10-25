package com.company.moviebooking.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScreenLayout {

    private Long screenId;

    private Long theatreId;
    //clob data
    private String seatingPlan;

}
