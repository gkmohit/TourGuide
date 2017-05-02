package com.example.gkmohit.tourguide.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gkmohit.tourguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksTO extends Fragment {


    private View rootView;
    public ParksTO() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_parks_to, container, false);

        return rootView;
    }

}
