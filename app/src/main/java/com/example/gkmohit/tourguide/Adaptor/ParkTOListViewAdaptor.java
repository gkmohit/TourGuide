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
    private ArrayList<Park> mData;

    // View lookup cache
    private static class ViewHolder {
        TextView objectName;
        TextView objectAddress;
        ImageView objectImage;

    }
    public ParkTOListViewAdaptor(Context context, ArrayList<Park> objects) {
        super(context, R.layout.image_text_row_item, objects);
        this.mContext = context;
        this.mData = objects;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Nullable
    @Override
    public Park getItem(int position) {
        return mData.get(position);
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
            viewHolder.objectName = (TextView) convertView.findViewById(R.id.parkName);
            viewHolder.objectAddress = (TextView) convertView.findViewById(R.id.parkAddress);
            viewHolder.objectImage = (ImageView) convertView.findViewById(R.id.parkImage);


            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ParkTOListViewAdaptor.ViewHolder) convertView.getTag();

        }


        viewHolder.objectName.setText(park.getName());
        viewHolder.objectAddress.setText(park.getAddress());
        Glide.with(mContext).load(park.getImageUrl()).into(viewHolder.objectImage);

        // Return the completed view to render on screen
        return convertView;
    }
}
