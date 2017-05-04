package com.example.gkmohit.tourguide.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.gkmohit.tourguide.Modal.University;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UniversitiesTO extends Fragment {


    private View rootView;
    private ListView mUniversityListView;
    private ArrayList<String> mUniversityNames;

    public UniversitiesTO() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_universities_to, container, false);
        initViews();
        createUniversities();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_list_item_1, mUniversityNames);
        mUniversityListView.setAdapter(arrayAdapter);
        return rootView;
    }

    private void initViews(){
        mUniversityListView = (ListView) rootView.findViewById(R.id.universityListView);
    }

    private void createUniversities(){
        mUniversityNames = new ArrayList<>();
        for (int i = 0; i < 7; i++){
            University university = new University( "University " + (Math.random() * 12 + 1), i);
            mUniversityNames.add(university.getName());
        }


    }


}
