package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MRData {
    private String xmlns;
    private String series;
    private String url;
    private String limit;
    private String total;
    private StandingsTable standingsTable;
}
