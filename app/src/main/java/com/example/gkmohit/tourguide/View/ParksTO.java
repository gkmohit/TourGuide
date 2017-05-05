package com.example.gkmohit.tourguide.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.gkmohit.tourguide.Adaptor.ParkTOListViewAdaptor;
import com.example.gkmohit.tourguide.Modal.Park;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksTO extends Fragment {


    private View rootView;
    private ListView mParksListView;
    private ArrayList<Park> mParksList;
    public ParksTO() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_parks_to, container, false);
        initViews();
        createParks();
        ParkTOListViewAdaptor parksAdaptor = new ParkTOListViewAdaptor(rootView.getContext(), mParksList);
        mParksListView.setAdapter(parksAdaptor);
        return rootView;
    }

    private void initViews(){
        mParksListView = (ListView) rootView.findViewById(R.id.parksListView);
    }

    private void createParks(){
        mParksList = new ArrayList<>();
        Park p1 = new Park(rootView.getContext().getString(R.string.lavender_creek_trail),
                rootView.getContext().getString(R.string.lavender_creek_address),
                rootView.getContext().getString(R.string.lavender_creek_hours),
                "https://i.ytimg.com/vi/XT5URkO2H5s/maxresdefault.jpg");

        Park p2 = new Park(rootView.getContext().getString(R.string.james_garden),
                rootView.getContext().getString(R.string.james_garden_address),
                rootView.getContext().getString(R.string.james_garden_hours),
                "http://www.whattodotoronto.com/assets/James-Gardens-whatTOdo-Toronto-1-20120121-130505.jpg");

        Park p3 = new Park(rootView.getContext().getString(R.string.high_park),
                rootView.getContext().getString(R.string.high_park_address),
                rootView.getContext().getString(R.string.high_park_hours),
                "http://s3.amazonaws.com/btoimage/prism-thumbnails/articles/807e-2015428-cherry-blossoms-high-park.jpg-resize_then_crop-_frame_bg_color_FFF-h_1365-gravity_center-q_70-preserve_ratio_true-w_2048_.jpg");

        Park p4 = new Park(rootView.getContext().getString(R.string.earl_bales),
                rootView.getContext().getString(R.string.earl_bales_address),
                rootView.getContext().getString(R.string.earl_bales_hours),
                "https://igx.4sqi.net/img/general/699x268/3944749_jc4nQfBIRLEsocqsU73U8uZZsqqwO82FJq8GI8iHeWk.jpg");


        mParksList.add(p1);
        mParksList.add(p2);
        mParksList.add(p3);
        mParksList.add(p4);
    }
}
