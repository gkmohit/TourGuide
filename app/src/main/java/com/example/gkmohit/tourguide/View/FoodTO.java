package com.example.gkmohit.tourguide.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gkmohit.tourguide.Adaptor.ListViewAdaptor;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodTO extends Fragment {


    private ArrayList<FoodTO> mFoodTOArrayList;
    private ListViewAdaptor mFoodListViewAdaptor;
    private View rootView;
    public FoodTO() {
        // Required empty public constructor
        

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_food_to, container, false);


        return rootView;
    }

}
