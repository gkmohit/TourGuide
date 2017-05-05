package com.example.gkmohit.tourguide.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.gkmohit.tourguide.Adaptor.SportsTOListViewAdaptor;
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
    private ArrayList<Sport> mSportsArray;

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
        SportsTOListViewAdaptor sportsTOListViewAdaptor = new SportsTOListViewAdaptor(rootView.getContext(), mSportsArray);
        mSportsListView.setAdapter(sportsTOListViewAdaptor);
        return rootView;
    }

    private void initViews(){
        mSportsListView = (ListView) rootView.findViewById(R.id.sportsListView);
    }

    private void createSports(){

        mSportsArray = new ArrayList<>();
        Sport s1 = new Sport(rootView.getContext().getString(R.string.raptors),
                rootView.getContext().getString(R.string.raptors_sport),
                rootView.getContext().getString(R.string.raptors_stadium),
                "http://i.cdn.turner.com/nba/nba/.element/img/1.0/teamsites/logos/teamlogos_500x500/tor.png");
        Sport s2 = new Sport(rootView.getContext().getString(R.string.jays),
                rootView.getContext().getString(R.string.jays_sport),
                rootView.getContext().getString(R.string.jays_stadium),
                "https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Toronto_Blue_Jays_logo.svg/1024px-Toronto_Blue_Jays_logo.svg.png");


        Sport s3 = new Sport(rootView.getContext().getString(R.string.leafs),
                rootView.getContext().getString(R.string.leafs_sport),
                rootView.getContext().getString(R.string.leafs_stadium),
                "https://1.bp.blogspot.com/_r8tWGVHrjGI/RnAqzbzZb1I/AAAAAAAAAoo/kRaAPL2EsHU/s200/Leafs_logo_2.png");

        mSportsArray.add(s1);
        mSportsArray.add(s2);
        mSportsArray.add(s3);
    }

}
