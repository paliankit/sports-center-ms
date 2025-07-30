package com.example.service;

import com.example.model.DriverStanding;
import com.example.model.DriverStandingResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class F1Service {
    private static final String BASE = "https://api.jolpi.ca/ergast/f1/2025";
    private final RestTemplate rest = new RestTemplate();

    public List<DriverStanding> getDriverStandings() {
        String url = BASE + "/driverstandings";
        DriverStandingResponse resp = rest.getForObject(url,DriverStandingResponse.class);
//        String rawJson=rest.getForObject(url,String.class);
//        System.out.println(rawJson);
        if(resp!=null && resp.getMRData()!=null && resp.getMRData().getStandingsTable()!=null
        && !resp.getMRData().getStandingsTable().getStandingsLists().isEmpty()){
            return resp.getMRData().getStandingsTable().getStandingsLists().get(0).getDriverStandings();
        }
        return Collections.emptyList();
    }

//    public List<ConstructorStanding> getConstructorStandings() {
//        String url = BASE + "/constructorstandings.json";
//        ResponseEntity<MRData<ConstructorStanding>> resp = rest.exchange(
//                url, org.springframework.http.HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<MRData<ConstructorStanding>>() {});
//        return resp.getBody()
//                .getStandingsTable()
//                .getStandingsLists().get(0)
//                .getConstructorStandings();
//    }
}
