package com.example.gkmohit.tourguide.Modal;

/**
 * Created by gkmohit on 02/05/17.
 */

public class Park {

    private String mName;
    private String mAddress;
    private int mEstablishedYear;

    public Park() {
    }

    public Park(String name, String address, int establishedYear) {
        mName = name;
        mAddress = address;
        mEstablishedYear = establishedYear;
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
