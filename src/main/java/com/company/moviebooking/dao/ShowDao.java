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
public class ShowDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public ShowDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public List<RunningMovie> getShows(Long theatreId, Long movieId, LocalDate movieDate){
        List<RunningMovie> movies = null;
        String sql = "SELECT * FROM RUNNINGMOVIE R JOIN THEATRE T ON R.THEATREID = T.THEATREID WHERE 1=1 " +
                "AND R.MOVIEID = :movieId " +
                "AND T.THEATREID = :theatreId " +
                "AND DATEPART(R.SHOWTIME) = :showTime";

        Map<String, Object> params = new HashMap<>();
        params.put("movieId", movieId);
        params.put("theatreId", theatreId);
        params.put("showTime", movieDate);

        return namedParameterJdbcTemplate.query(sql, params, BeanPropertyRowMapper.newInstance(RunningMovie.class));

    }

    public void addShow(List<RunningMovie> runningMovies){

    }

    public void updateShow(List<RunningMovie> runningMovies){

    }

    public void deleteShow(List<RunningMovie> runningMovies){

    }
}
