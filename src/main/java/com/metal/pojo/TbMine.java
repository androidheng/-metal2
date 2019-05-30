package com.metal.pojo;

public class TbMine {
    private Integer id;

    private String minename;

    private String city;

    private String lat;

    private String lon;

    private String maxcount;

    private String no;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMinename() {
        return minename;
    }

    public void setMinename(String minename) {
        this.minename = minename == null ? null : minename.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    public String getMaxcount() {
        return maxcount;
    }

    public void setMaxcount(String maxcount) {
        this.maxcount = maxcount == null ? null : maxcount.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }
}