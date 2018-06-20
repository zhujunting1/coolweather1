package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/21.
 */

public class City extends DataSupport {
    private int id;
    private  String cityname;
    private int citycode;
    private int provinceid;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityname(){
        return cityname;
    }
    public void setCityname(String name){
        this.cityname=name;
    }
    public int getCitycode(){
        return citycode;
    }
    public void setCitycode(int code){
        this.citycode=code;
    }
    public int getProvinceid(){
        return provinceid;
    }
    public void setProvinceid(int provinceid){
        this.provinceid=provinceid;
    }
}
