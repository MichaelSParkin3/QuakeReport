package com.example.android.quakereport;

/**
 * Created by Michael S Parkin III on 1/16/2018.
 */

public class Earthquake {

    private double mMagnitude;
    private String mCity;
    private long mDate;
    private String mUrl;




    public Earthquake (double magnitude, String city, long date, String url) {
        mMagnitude = magnitude;
        mCity = city;
        mDate = date;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getCity() {
        return mCity;
    }

    public long getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

}
