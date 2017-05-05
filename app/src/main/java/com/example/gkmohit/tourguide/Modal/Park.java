package com.example.gkmohit.tourguide.Modal;

/**
 * Created by gkmohit on 02/05/17.
 */

public class Park {

    private String mName;
    private String mAddress;
    private String mHours;
    private String mImageUrl;

    public Park(String name, String address, String hours, String imageUrl) {
        mName = name;
        mAddress = address;
        mHours = hours;
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getHours() {
        return mHours;
    }

    public String getImageUrl() {
        return mImageUrl;
    }
}
