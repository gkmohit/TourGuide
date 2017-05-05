package com.example.gkmohit.tourguide.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.gkmohit.tourguide.Adaptor.UniversityTOListViewAdaptor;
import com.example.gkmohit.tourguide.Modal.University;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UniversitiesTO extends Fragment {


    private View rootView;
    private ListView mUniversityListView;
    private ArrayList<University> mUniversityArrayList;

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

        UniversityTOListViewAdaptor universityTOListViewAdaptor = new UniversityTOListViewAdaptor(mUniversityArrayList, rootView.getContext());
        mUniversityListView.setAdapter(universityTOListViewAdaptor);
        return rootView;
    }

    private void initViews(){
        mUniversityListView = (ListView) rootView.findViewById(R.id.universityListView);
    }

    private void createUniversities(){
        mUniversityArrayList = new ArrayList<>();
        University uw = new University(rootView.getContext().getString(R.string.uw),
                rootView.getContext().getString(R.string.uw_moto),
                rootView.getContext().getString(R.string.uw_number_of_students),
                rootView.getContext().getString(R.string.uw_rank));

        University uoft = new University(rootView.getContext().getString(R.string.uoft),
                rootView.getContext().getString(R.string.uoft_moto),
                rootView.getContext().getString(R.string.uoft_number_of_students),
                rootView.getContext().getString(R.string.uoft_rank));

        University yorkU = new University(rootView.getContext().getString(R.string.yorku),
                rootView.getContext().getString(R.string.yorku_moto),
                rootView.getContext().getString(R.string.yorku_number_of_students),
                rootView.getContext().getString(R.string.yorku_rank));

        University ryerson = new University(rootView.getContext().getString(R.string.ryerson_university),
                rootView.getContext().getString(R.string.ryerson_university_moto),
                rootView.getContext().getString(R.string.ryerson_university_number_of_students),
                rootView.getContext().getString(R.string.ryerson_university_rank));

        University uoit = new University(rootView.getContext().getString(R.string.uoit),
                rootView.getContext().getString(R.string.uoit_moto),
                rootView.getContext().getString(R.string.uoit_number_of_students),
                rootView.getContext().getString(R.string.uoit_rank));

        mUniversityArrayList.add(uw);
        mUniversityArrayList.add(uoft);
        mUniversityArrayList.add(yorkU);
        mUniversityArrayList.add(ryerson);
        mUniversityArrayList.add(uoit);


    }


}
