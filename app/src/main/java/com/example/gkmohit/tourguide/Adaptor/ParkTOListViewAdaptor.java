package com.example.gkmohit.tourguide.Adaptor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gkmohit.tourguide.Modal.Park;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;

/**
 * Created by gkmohit on 04/05/17.
 */

public class ParkTOListViewAdaptor extends ArrayAdapter<Park> {

    private Context mContext;
    private ArrayList<Park> mParkArrayList;

    // View lookup cache
    private static class ViewHolder {
        TextView parkName;
        TextView parkAddress;
        TextView parkEstablishedYear;
        ImageView parkImage;

    }
    public ParkTOListViewAdaptor(Context context, ArrayList<Park> objects) {
        super(context, R.layout.image_text_row_item, objects);
        this.mContext = context;
        this.mParkArrayList = objects;
    }

    @Override
    public int getCount() {
        return mParkArrayList.size();
    }

    @Nullable
    @Override
    public Park getItem(int position) {
        return mParkArrayList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Park park = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag


        if (convertView == null) {

            viewHolder = new ParkTOListViewAdaptor.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.image_text_row_item, parent, false);
            viewHolder.parkName = (TextView) convertView.findViewById(R.id.parkName);
            viewHolder.parkAddress = (TextView) convertView.findViewById(R.id.parkAddress);
            viewHolder.parkEstablishedYear = (TextView) convertView.findViewById(R.id.parkHours);
            viewHolder.parkImage = (ImageView) convertView.findViewById(R.id.parkImage);


            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ParkTOListViewAdaptor.ViewHolder) convertView.getTag();

        }


        viewHolder.parkName.setText(park.getName());
        viewHolder.parkAddress.setText(park.getAddress());
        viewHolder.parkEstablishedYear.setText(park.getHours() + "");
        Glide.with(mContext).load(park.getImageUrl()).into(viewHolder.parkImage);

        // Return the completed view to render on screen
        return convertView;
    }
}
