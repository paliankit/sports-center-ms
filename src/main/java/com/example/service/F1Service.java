package com.example.service;

import com.example.model.ConstructorStandings;
import com.example.model.DriverStandings;
import com.example.model.DriverStandingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class F1Service {

    @Value("${f1.base.uri}")
    private String f1BaseURI;

    @Autowired
    private RestTemplate restTemplate;

    String currentYear=String.valueOf(LocalDate.now().getYear());

    @Cacheable("driverStandings")
    public List<DriverStandings> getDriverStandings() {
        String url = f1BaseURI + currentYear+ "/driverstandings";
        long startTime=System.currentTimeMillis();
        DriverStandingResponse resp = restTemplate.getForObject(url,DriverStandingResponse.class);
        long timeTaken =System.currentTimeMillis()-startTime;
        System.out.println("API call for driver standing took: "+ timeTaken +" ms");
        if(resp!=null && resp.getMrdata()!=null && resp.getMrdata().getStandingsTable()!=null
        && !resp.getMrdata().getStandingsTable().getStandingsLists().isEmpty()){
            return resp.getMrdata().getStandingsTable().getStandingsLists().get(0).getDriverStandings();
        }
        return Collections.emptyList();
    }

    @Cacheable("constructorStandings")
    public List<ConstructorStandings> getConstructorStandings() {
        String url = f1BaseURI + currentYear+ "/constructorstandings";
        long startTime=System.currentTimeMillis();

        DriverStandingResponse resp = restTemplate.getForObject(url,DriverStandingResponse.class);

        long timeTaken =System.currentTimeMillis()-startTime;
        System.out.println("API call for constructors standing took: "+ timeTaken +" ms");
        if(resp!=null && resp.getMrdata()!=null && resp.getMrdata().getStandingsTable()!=null
                && !resp.getMrdata().getStandingsTable().getStandingsLists().isEmpty()){
            return resp.getMrdata().getStandingsTable().getStandingsLists().get(0).getConstructorStandings();
        }
        return Collections.emptyList();
    }

}
