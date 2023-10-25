package com.company.moviebooking.dao;

import com.company.moviebooking.model.RunningMovie;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class MovieBookingDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public MovieBookingDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public List<RunningMovie> getMovieShowtime(Long movieId, String city, LocalDate movieDate ){

        String sql = "SELECT * FROM RUNNINGMOVIE R JOIN THEATRE T ON R.THEATREID = T.THEATREID WHERE 1=1 " +
                "AND T.CITY = :city " +
                "AND R.MOVIEID = :movieId " +
                "AND DATEPART(R.SHOWTIME) = :showTime";

        Map<String, Object> params = new HashMap<>();
        params.put("city", city);
        params.put("movieId", movieId);
        params.put("showTime", movieDate);

        return namedParameterJdbcTemplate.query(sql, params, BeanPropertyRowMapper.newInstance(RunningMovie.class));
    }
}
