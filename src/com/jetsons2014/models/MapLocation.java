package com.jetsons2014.models;

/**
 * Created by bradtop on 2/22/14.
 */
public class MapLocation {

    private long mLongitude;
    private long mLatitude;
    private String mName;

    public MapLocation(long longitude, long latitude, String name) {
        mLongitude = longitude;
        mLatitude = latitude;
        mName = name;
    }

    public long getLongitude() {
        return mLongitude;
    }

    public long getmLatitude() {
        return mLatitude;
    }

    public String getName() {
        return mName;
    }
}
