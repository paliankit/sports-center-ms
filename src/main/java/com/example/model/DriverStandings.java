package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverStandings {

    private String position;
    private String positionText;
    private String points;
    private String wins;
    @JsonProperty("Driver")
    private Driver driver;
    @JsonProperty("Constructors")
    private List<Constructors> constructors;

//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public String getPositionText() {
//        return positionText;
//    }
//
//    public void setPositionText(String positionText) {
//        this.positionText = positionText;
//    }
//
//    public String getPoints() {
//        return points;
//    }
//
//    public void setPoints(String points) {
//        this.points = points;
//    }
//
//    public String getWins() {
//        return wins;
//    }
//
//    public void setWins(String wins) {
//        this.wins = wins;
//    }
//
//    public Driver getDriver() {
//        return Driver;
//    }
//
//    public void setDriver(Driver driver) {
//        Driver = driver;
//    }
//
//    public List<Constructors> getConstructors() {
//        return Constructors;
//    }
//
//    public void setConstructors(List<Constructors> constructors) {
//        Constructors = constructors;
//    }
}
