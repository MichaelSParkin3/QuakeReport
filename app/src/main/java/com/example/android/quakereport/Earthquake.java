package com.example.android.quakereport;

/**
 * Created by Michael S Parkin III on 1/16/2018.
 */

public class Earthquake {

    //Stores the magnitude of each earthquake.
    private double mMagnitude;
    //Stores the location for each earthquake.
    private String mCity;
    //Stores the date for each earthquake.
    private long mDate;
    //Stores the url for each earthquake.
    private String mUrl;



    //Constructor for earthquake object
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
