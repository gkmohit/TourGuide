package com.example.gkmohit.tourguide.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.gkmohit.tourguide.Modal.Resturant;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;

/**
 * Created by gkmohit on 03/05/17.
 */

public class FoodTOListViewAdaptor extends ArrayAdapter<Resturant> {

    private ArrayList<Resturant> mResturants;
    private Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView resturantName;
        TextView resturantAddress;
        TextView resturantPhoneNumber;
        TextView resturantCusine;

    }

    public FoodTOListViewAdaptor(ArrayList<Resturant> resturants, Context context) {
        super(context, R.layout.one_heading_three_subheading_row_item, resturants);
        this.mContext = context;
        this.mResturants = resturants;

    }



    @Override
    public int getCount() {
        return mResturants.size();
    }

    @Override
    public Resturant getItem(int position) {
        return mResturants.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Resturant resturant = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag


        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.one_heading_three_subheading_row_item, parent, false);
            viewHolder.resturantName = (TextView) convertView.findViewById(R.id.headingText);
            viewHolder.resturantAddress = (TextView) convertView.findViewById(R.id.subHeadingOne);
            viewHolder.resturantPhoneNumber = (TextView) convertView.findViewById(R.id.subHeadingTwo);
            viewHolder.resturantCusine = (TextView) convertView.findViewById(R.id.subHeadingThree);


            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();

        }


        viewHolder.resturantName.setText(resturant.getName());
        viewHolder.resturantAddress.setText(resturant.getAddress());
        viewHolder.resturantPhoneNumber.setText(resturant.getPhoneNumber());
        viewHolder.resturantCusine.setText(resturant.getCusine());


        // Return the completed view to render on screen
        return convertView;
    }
}
