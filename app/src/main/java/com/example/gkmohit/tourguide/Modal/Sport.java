package com.example.gkmohit.tourguide.Modal;

/**
 * Created by gkmohit on 02/05/17.
 */

public class Sport {

    private String mTeamName;
    private String mSport;
    private String mStadium;

    public Sport(String teamName, String sport, String stadium) {
        mTeamName = teamName;
        mSport = sport;
        mStadium = stadium;
    }

    public String getTeamName() {
        return mTeamName;
    }

    public void setTeamName(String teamName) {
        mTeamName = teamName;
    }

    public String getSport() {
        return mSport;
    }

    public void setSport(String sport) {
        mSport = sport;
    }

    public String getStadium() {
        return mStadium;
    }

    public void setStadium(String stadium) {
        mStadium = stadium;
    }
}
