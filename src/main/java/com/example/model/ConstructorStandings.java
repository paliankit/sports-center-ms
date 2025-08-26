package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConstructorStandings {

    @JsonProperty("Constructor")
    private Constructors constructors;
    private String points;
    private String position;
    private String positionText;
    private String wins;

}
