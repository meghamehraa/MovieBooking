package com.company.moviebooking.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Theatre {

    private Long theatreId;

    private Long partnerId;

    private String name;

    private String address;

    private String city;
}
