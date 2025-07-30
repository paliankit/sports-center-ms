package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandingsList {

    private String season;
    private String round;
    private List<DriverStanding> DriverStandings;
}
