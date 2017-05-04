package com.example.gkmohit.tourguide.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.gkmohit.tourguide.Modal.Sport;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SportsTO extends Fragment {


    private View rootView;
    private ListView mSportsListView;
    private ArrayList<String> mSportsArray;

    public SportsTO() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_sports_to, container, false);
        initViews();
        createSports();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_list_item_1, mSportsArray);
        mSportsListView.setAdapter(arrayAdapter);
        return rootView;
    }

    private void initViews(){
        mSportsListView = (ListView) rootView.findViewById(R.id.sportsListView);
    }

    private void createSports(){

        mSportsArray = new ArrayList<>();
        Sport s1 = new Sport("Toronto Raptors", "Basketball", "Air Canada Centre");
        Sport s2 = new Sport("Toronto Maple Leafs", "Ice Hockey", "Air Canada Centre");
        Sport s3 = new Sport("Toronto Blue Jays", "Baseball", "The Rogers Centre");

        mSportsArray.add(s1.getTeamName());
        mSportsArray.add(s2.getTeamName());
        mSportsArray.add(s3.getTeamName());
    }

}
