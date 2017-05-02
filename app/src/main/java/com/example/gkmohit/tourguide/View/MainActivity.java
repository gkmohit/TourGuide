package com.example.gkmohit.tourguide.View;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gkmohit.tourguide.Adaptor.MainActivityViewPageAdaptor;
import com.example.gkmohit.tourguide.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        MainActivityViewPageAdaptor homePageAdaptor = new MainActivityViewPageAdaptor( getSupportFragmentManager(), MainActivity.this);
        // Set the adapter onto the view pager
        viewPager.setAdapter(homePageAdaptor);

        //Find the tab layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        //Set the tab layout with view pager
        tabLayout.setupWithViewPager(viewPager);
    }
}
