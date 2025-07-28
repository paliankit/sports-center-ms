package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StandingsTable {

    private String season;
    private String round;
    private List<StandingsLists> standingsLists;
}
