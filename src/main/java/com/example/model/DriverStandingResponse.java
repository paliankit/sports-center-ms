package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverStandingResponse {
    @JsonProperty("MRData")
    private MRData mrdata;

//    public MRData getMrdata() {
//        return mrdata;
//    }
//
//    public void setMrdata(MRData mrdata) {
//        this.mrdata = mrdata;
//    }
}
