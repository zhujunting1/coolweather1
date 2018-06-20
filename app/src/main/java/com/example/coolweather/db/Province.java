package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/21.
 */

public class Province extends DataSupport {
    private int id;
    private  String provincename;
    private int provincecode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvincename(){
        return provincename;
    }
    public void setProvincename(String name){
        this.provincename=provincename;
    }
    public int getProvincecode(){
        return provincecode;
    }
    public void setProvincecode(int code){
        this.provincecode=code;
    }
}
