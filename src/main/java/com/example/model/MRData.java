package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private String offset;
    private String total;
    @JsonProperty("StandingsTable")
    private StandingsTable standingsTable;

//    public String getXmlns() {
//        return xmlns;
//    }
//
//    public void setXmlns(String xmlns) {
//        this.xmlns = xmlns;
//    }
//
//    public String getSeries() {
//        return series;
//    }
//
//    public void setSeries(String series) {
//        this.series = series;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getLimit() {
//        return limit;
//    }
//
//    public void setLimit(String limit) {
//        this.limit = limit;
//    }
//
//    public String getOffset() {
//        return offset;
//    }
//
//    public void setOffset(String offset) {
//        this.offset = offset;
//    }
//
//    public String getTotal() {
//        return total;
//    }
//
//    public void setTotal(String total) {
//        this.total = total;
//    }
//
//    public StandingsTable getStandingsTable() {
//        return StandingsTable;
//    }
//
//    public void setStandingsTable(StandingsTable standingsTable) {
//        StandingsTable = standingsTable;
//    }
}
