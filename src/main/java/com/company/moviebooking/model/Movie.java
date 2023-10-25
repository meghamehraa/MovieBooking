package com.company.moviebooking.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Movie {

    private String name;

    private LocalDate releaseDate;

    private String language;

    private String genre;

    private String cast;

}
