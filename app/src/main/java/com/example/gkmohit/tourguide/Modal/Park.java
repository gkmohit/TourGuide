package com.example.gkmohit.tourguide.Modal;

/**
 * Created by gkmohit on 02/05/17.
 */

public class Park {

    private String mName;
    private String mAddress;
    private int mEstablishedYear;
    private String mImageUrl;

    public Park(String name, String address, int establishedYear, String imageUrl) {
        mName = name;
        mAddress = address;
        mEstablishedYear = establishedYear;
        mImageUrl = imageUrl;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public int getEstablishedYear() {
        return mEstablishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        mEstablishedYear = establishedYear;
    }
}
