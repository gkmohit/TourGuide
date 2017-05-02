package com.example.gkmohit.tourguide.Modal;

/**
 * Created by gkmohit on 02/05/17.
 */

public class Resturant {

    private String mName;
    private String mAddress;
    private String mPhoneNumber;
    private String mCusine;
    public Resturant() {
    }

    public Resturant(String mName, String mAddress, String mPhoneNumber, String mCusine) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhoneNumber = mPhoneNumber;
        this.mCusine = mCusine;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getCusine() {
        return mCusine;
    }

    public void setCusine(String mCusine) {
        this.mCusine = mCusine;
    }
}
