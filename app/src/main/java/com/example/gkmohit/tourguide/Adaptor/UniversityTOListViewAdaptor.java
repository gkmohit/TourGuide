package com.example.gkmohit.tourguide.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.gkmohit.tourguide.Modal.Resturant;
import com.example.gkmohit.tourguide.Modal.University;
import com.example.gkmohit.tourguide.R;

import java.util.ArrayList;

/**
 * Created by gkmohit on 05/05/17.
 */

public class UniversityTOListViewAdaptor extends ArrayAdapter<University> {

    private ArrayList<University> mResturants;
    private Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView universityName;
        TextView universityMotto;
        TextView universityNumOfStudents;
        TextView universityRank;

    }

    public UniversityTOListViewAdaptor(ArrayList<University> universities, Context context) {
        super(context, R.layout.one_heading_three_subheading_row_item, universities);
        this.mContext = context;
        this.mResturants = universities;

    }



    @Override
    public int getCount() {
        return mResturants.size();
    }

    @Override
    public University getItem(int position) {
        return mResturants.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        University university = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        UniversityTOListViewAdaptor.ViewHolder viewHolder; // view lookup cache stored in tag


        if (convertView == null) {

            viewHolder = new UniversityTOListViewAdaptor.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.one_heading_three_subheading_row_item, parent, false);
            viewHolder.universityName = (TextView) convertView.findViewById(R.id.headingText);
            viewHolder.universityMotto = (TextView) convertView.findViewById(R.id.subHeadingOne);
            viewHolder.universityNumOfStudents = (TextView) convertView.findViewById(R.id.subHeadingTwo);
            viewHolder.universityRank = (TextView) convertView.findViewById(R.id.subHeadingThree);


            convertView.setTag(viewHolder);
        } else {
            viewHolder = (UniversityTOListViewAdaptor.ViewHolder) convertView.getTag();

        }


        viewHolder.universityName.setText(university.getName());
        viewHolder.universityMotto.setText(university.getMoto());
        viewHolder.universityNumOfStudents.setText(university.getNumberOfStudents());
        viewHolder.universityRank.setText(university.getRank());


        // Return the completed view to render on screen
        return convertView;
    }
}
