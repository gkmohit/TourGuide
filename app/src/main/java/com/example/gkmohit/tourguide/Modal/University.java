package com.example.gkmohit.tourguide.Modal;

/**
 * Created by gkmohit on 04/05/17.
 */

public class University {

    private String mName;
    private int rank;

    public University(String name, int rank) {
        mName = name;
        this.rank = rank;
    }

    public String getName() {
        return mName;
    }

    public int getRank() {
        return rank;
    }
}
