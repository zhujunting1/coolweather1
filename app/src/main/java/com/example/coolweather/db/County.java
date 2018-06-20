package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/21.
 */

public class County extends DataSupport {
    private int id;
    private String countyname;
    private String weatherid;
    private int cityid;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyname(){
        return countyname;
    }
    public void setCountyname(String name){
        this.countyname=name;
    }
    public String getWeatherid(){
        return weatherid;
    }
    public void setWeatherid(String weatherid){
        this.weatherid=weatherid;
    }
    public int getCityid(){
        return cityid;
    }
    public void setCityid(int id){
        this.cityid=id;
    }
}
