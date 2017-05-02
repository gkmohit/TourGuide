package com.example.gkmohit.tourguide.Adaptor;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.gkmohit.tourguide.R;
import com.example.gkmohit.tourguide.View.FoodTO;
import com.example.gkmohit.tourguide.View.ParksTO;
import com.example.gkmohit.tourguide.View.SportsTO;
import com.example.gkmohit.tourguide.View.UniversitiesTO;


public class MainActivityViewPageAdaptor extends FragmentPagerAdapter {


    private Context mContext;

    public MainActivityViewPageAdaptor(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new FoodTO();
        } else if (position == 2) {
            return new ParksTO();
        } else if (position == 3) {
            return new UniversitiesTO();
        } else {
            return new SportsTO();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 1) {
            return (mContext.getString(R.string.food_to));
        } else if (position == 2) {
            return (mContext.getString(R.string.parks_to));
        } else if (position == 3) {
            return (mContext.getString(R.string.universities_to));
        } else {
            return (mContext.getString(R.string.sports_to));
        }
    }
}
