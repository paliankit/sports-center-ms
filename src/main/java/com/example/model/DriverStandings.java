package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverStandings {

    private String position;
    private String positionText;
    private String points;
    private String wins;
    private Driver driver;
    private List<Constructors> constructors;
}
