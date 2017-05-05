package com.example.gkmohit.tourguide.Modal;

/**
 * Created by gkmohit on 04/05/17.
 */

public class University {

    private String mName;
    private String mMoto;
    private String mNumberOfStudents;
    private String rank;

    public University(String name, String moto, String numberOfStudents, String rank) {
        mName = name;
        mMoto = moto;
        mNumberOfStudents = numberOfStudents;
        this.rank = rank;
    }

    public String getName() {
        return mName;
    }

    public String getMoto() {
        return mMoto;
    }

    public String getNumberOfStudents() {
        return mNumberOfStudents;
    }

    public String getRank() {
        return rank;
    }
}
