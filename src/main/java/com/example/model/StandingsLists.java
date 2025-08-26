package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandingsLists {

    private String season;
    private String round;
    @JsonProperty("DriverStandings")
    private List<DriverStandings> driverStandings;
    @JsonProperty("ConstructorStandings")
    private List<ConstructorStandings> constructorStandings;

//    public String getSeason() {
//        return season;
//    }
//
//    public void setSeason(String season) {
//        this.season = season;
//    }
//
//    public String getRound() {
//        return round;
//    }
//
//    public void setRound(String round) {
//        this.round = round;
//    }
//
//    public List<DriverStandings> getDriverStandings() {
//        return DriverStandings;
//    }
//
//    public void setDriverStandings(List<DriverStandings> driverStandings) {
//        DriverStandings = driverStandings;
//    }
}
