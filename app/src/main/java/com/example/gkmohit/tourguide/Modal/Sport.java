package com.example.gkmohit.tourguide.Modal;

/**
 * Created by gkmohit on 02/05/17.
 */

public class Sport {

    private String mTeamName;
    private String mSport;
    private String mStadium;
    private String mTeamLogo;

    public Sport(String teamName, String sport, String stadium, String teamLogo) {
        mTeamName = teamName;
        mSport = sport;
        mStadium = stadium;
        mTeamLogo = teamLogo;
    }

    public String getTeamLogo() {
        return mTeamLogo;
    }

    public String getTeamName() {
        return mTeamName;
    }

    public String getSport() {
        return mSport;
    }

    public String getStadium() {
        return mStadium;
    }
}
