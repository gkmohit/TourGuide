package com.example.gkmohit.tourguide.Modal;

/**
 * Created by gkmohit on 02/05/17.
 */

public class Resturant {

    private String mName;
    private String mAddress;
    private String mPhoneNumber;
    private String mCusine;


    public Resturant(String mName, String mAddress, String mPhoneNumber, String mCusine) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhoneNumber = mPhoneNumber;
        this.mCusine = mCusine;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getCusine() {
        return mCusine;
    }

    @Override
    public String toString() {
        return "Resturant{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mPhoneNumber='" + mPhoneNumber + '\'' +
                ", mCusine='" + mCusine + '\'' +
                '}';
    }
}
