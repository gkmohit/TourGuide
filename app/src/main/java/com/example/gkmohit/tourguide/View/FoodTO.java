package com.example.gkmohit.tourguide.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.gkmohit.tourguide.Adaptor.FoodTOListViewAdaptor;
import com.example.gkmohit.tourguide.Adaptor.ListViewAdaptor;
import com.example.gkmohit.tourguide.Modal.Resturant;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;
import java.util.UUID;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodTO extends Fragment {


    private ArrayList<Resturant> mFoodTOArrayList;
    private ArrayList<String> mResturantNameArrayList;
    private View rootView;
    private ListView mFoodToListView;
    public FoodTO() {
        // Required empty public constructor
        

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_food_to, container, false);
        initViews();
        setFoodToList();

        FoodTOListViewAdaptor foodTOListViewAdaptor = new FoodTOListViewAdaptor(mFoodTOArrayList, rootView.getContext());

        mFoodToListView.setAdapter(foodTOListViewAdaptor);
        return rootView;
    }

    private void initViews(){
        mFoodToListView = (ListView) rootView.findViewById(R.id.foodListView);

    }


    private void setFoodToList(){
        mFoodTOArrayList = new ArrayList<>();
        for(int i = 0; i < 10 ; i++){


            Resturant resturant = new Resturant("Resturant " + i, "Resturant Address " + i, "1888-123- " + (i * 100), "Resturant Cusine " + i);
            mFoodTOArrayList.add(resturant);
        }

        mResturantNameArrayList = new ArrayList<>();

        for( int i = 0; i < mFoodTOArrayList.size(); i++){
            mResturantNameArrayList.add(mFoodTOArrayList.get(i).getName());
        }
    }

}
