package com.example.service;

import com.example.model.ConstructorStandings;
import com.example.model.DriverStandings;
import com.example.model.DriverStandingResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class F1Service {
    private static final String BASE = "https://api.jolpi.ca/ergast/f1/2025";
    private final RestTemplate rest = new RestTemplate();

    public List<DriverStandings> getDriverStandings() {
        String url = BASE + "/driverstandings";
        DriverStandingResponse resp = rest.getForObject(url,DriverStandingResponse.class);
//        String rawJson=rest.getForObject(url,String.class);
//        System.out.println(rawJson);
        if(resp!=null && resp.getMrdata()!=null && resp.getMrdata().getStandingsTable()!=null
        && !resp.getMrdata().getStandingsTable().getStandingsLists().isEmpty()){
            return resp.getMrdata().getStandingsTable().getStandingsLists().get(0).getDriverStandings();
        }
        return Collections.emptyList();
    }

    public List<ConstructorStandings> getConstructorStandings() {
        String url = BASE + "/constructorstandings";
        DriverStandingResponse resp = rest.getForObject(url,DriverStandingResponse.class);
//        String rawJson=rest.getForObject(url,String.class);
//        System.out.println(rawJson);
        if(resp!=null && resp.getMrdata()!=null && resp.getMrdata().getStandingsTable()!=null
                && !resp.getMrdata().getStandingsTable().getStandingsLists().isEmpty()){
            return resp.getMrdata().getStandingsTable().getStandingsLists().get(0).getConstructorStandings();
        }
        return Collections.emptyList();
    }
}
