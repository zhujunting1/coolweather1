package com.example.coolweather.util;
import android.text.TextUtils;

import com.example.coolweather.db.City;
import com.example.coolweather.db.County;
import com.example.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2018/6/21.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvincename(provinceObject.getString("name"));
                    province.setProvincecode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return false;
        }
    }
    public static boolean handleCityResponse(String response,int provinceid){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCities=new JSONArray(response);
                for(int i=0;i<allCities.length();i++){
                    JSONObject cityObject=allCities.getJSONObject(i);
                    City city=new City();
                    city.setCityname(cityObject.getString("name"));
                    city.setCitycode(cityObject.getInt("id"));
                    city.setProvinceid(provinceid);
                    city.save();
                }
                return true;
            }catch(JSONException e){
                e.printStackTrace();
            }
            return false;
        }
    }
    public static boolean handleCountyResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allcounties=new JSONArray(response);
                for(int i=0;i<allcounties.length();i++){
                    JSONObject countyObject=allcounties.getJSONObject(i);
                    County county=new County();
                    county.setCountyname(countyObject.getString("name"));
                    county.setWeatherid(countyObject.getString("weather_id"));
                    county.setCityid(cityId);
                }
                return true;
            }catch(JSONException e){
                e.printStackTrace();
            }
            return false;
        }
    }
}

