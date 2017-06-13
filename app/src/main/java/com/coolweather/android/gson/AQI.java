package com.coolweather.android.gson;

/**
 * Created by zhouyixin on 2017/6/12.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
