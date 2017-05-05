package com.example.gkmohit.tourguide.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.gkmohit.tourguide.Adaptor.FoodTOListViewAdaptor;
import com.example.gkmohit.tourguide.Modal.Resturant;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;

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

        Resturant keg = new Resturant(rootView.getContext().getString(R.string.keg),
                rootView.getContext().getString(R.string.keg_address),
                rootView.getContext().getString(R.string.keg_phone_number),
                rootView.getContext().getString(R.string.keg_cusine));

        Resturant jackAstors = new Resturant(rootView.getContext().getString(R.string.jack_astors),
                rootView.getContext().getString(R.string.jack_astors_address),
                rootView.getContext().getString(R.string.jack_astors_address),
                rootView.getContext().getString(R.string.jack_astors_cusine));

        Resturant paramount = new Resturant(rootView.getContext().getString(R.string.paramount),
                rootView.getContext().getString(R.string.paramount_address),
                rootView.getContext().getString(R.string.paramount_phone_number),
                rootView.getContext().getString(R.string.paramount_cusine));

        Resturant linGaraden = new Resturant(rootView.getContext().getString(R.string.lin_garden),
                rootView.getContext().getString(R.string.lin_garden_address),
                rootView.getContext().getString(R.string.lin_garden_phone_number),
                rootView.getContext().getString(R.string.lin_garden_cusine));

        Resturant host = new Resturant(rootView.getContext().getString(R.string.host),
                rootView.getContext().getString(R.string.host_address),
                rootView.getContext().getString(R.string.host_phone_number),
                rootView.getContext().getString(R.string.host_cusine));

        Resturant sushi168 = new Resturant(rootView.getContext().getString(R.string.sushi_168),
                rootView.getContext().getString(R.string.sushi_168_address),
                rootView.getContext().getString(R.string.sushi_168_phone_number),
                rootView.getContext().getString(R.string.sushi_168_cusine));

        mFoodTOArrayList.add(keg);
        mFoodTOArrayList.add(jackAstors);
        mFoodTOArrayList.add(paramount);
        mFoodTOArrayList.add(linGaraden);
        mFoodTOArrayList.add(host);
        mFoodTOArrayList.add(sushi168);

    }

}
