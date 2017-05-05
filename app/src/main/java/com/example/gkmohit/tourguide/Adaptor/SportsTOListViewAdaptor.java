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
import com.example.gkmohit.tourguide.Modal.Sport;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;

/**
 * Created by gkmohit on 02/05/17.
 */

public class SportsTOListViewAdaptor extends ArrayAdapter<Sport> {


    private Context mContext;
    private ArrayList<Sport> mSportArrayList;

    // View lookup cache
    private static class ViewHolder {
        TextView teamName;
        TextView sportStadium;
        TextView sportType;
        ImageView teamLogo;

    }
    public SportsTOListViewAdaptor(Context context, ArrayList<Sport> objects) {
        super(context, R.layout.image_text_row_item, objects);
        this.mContext = context;
        this.mSportArrayList = objects;
    }

    @Override
    public int getCount() {
        return mSportArrayList.size();
    }

    @Nullable
    @Override
    public Sport getItem(int position) {
        return mSportArrayList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Sport sport = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        SportsTOListViewAdaptor.ViewHolder viewHolder; // view lookup cache stored in tag


        if (convertView == null) {

            viewHolder = new SportsTOListViewAdaptor.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.image_text_row_item, parent, false);
            viewHolder.teamName = (TextView) convertView.findViewById(R.id.itemHeading);
            viewHolder.sportStadium = (TextView) convertView.findViewById(R.id.itemSubHeadingOne);
            viewHolder.sportType = (TextView) convertView.findViewById(R.id.itemSubHeadingTwo);
            viewHolder.teamLogo = (ImageView) convertView.findViewById(R.id.itemImage);


            convertView.setTag(viewHolder);
        } else {
            viewHolder = (SportsTOListViewAdaptor.ViewHolder) convertView.getTag();

        }


        viewHolder.teamName.setText(sport.getTeamName());
        viewHolder.sportStadium.setText(sport.getStadium());
        viewHolder.sportType.setText(sport.getSport());
        Glide.with(mContext).load(sport.getTeamLogo()).into(viewHolder.teamLogo);

        // Return the completed view to render on screen
        return convertView;
    }
}
