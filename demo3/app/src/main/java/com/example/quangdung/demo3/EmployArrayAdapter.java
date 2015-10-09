package com.example.quangdung.demo3;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by quangdung on 08/10/2015.
 */
public class EmployArrayAdapter extends ArrayAdapter<Employs> {
    Activity context = null;
    ArrayList<Employs> employs_arr = null;
    int layoutId;

    public EmployArrayAdapter(Activity context,int layoutId,ArrayList<Employs> employs_arr) {
        super(context,layoutId,employs_arr);
        this.context = context;
        this.layoutId = layoutId;
        this.employs_arr = employs_arr;
    }

    public View getView(int position, View convertView, ViewGroup parrent) {
        LayoutInflater inflaster = context.getLayoutInflater();
        convertView = inflaster.inflate(layoutId, null);
        TextView name_text = (TextView) convertView.findViewById(R.id.txtitem);
        final Employs emp = employs_arr.get(position);
        name_text.setText(emp.toString());
        ImageView sex_icon = (ImageView) convertView.findViewById(R.id.imgitem);
        if (emp.isGender()) {
            sex_icon.setImageResource(R.drawable.male);
        } else {
            sex_icon.setImageResource(R.drawable.female);
        }
        return convertView;
    }
}
