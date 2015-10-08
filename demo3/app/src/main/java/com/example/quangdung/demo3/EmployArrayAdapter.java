package com.example.quangdung.demo3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
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
        final TextView name_text = convertView.findViewById(R.id.txtitem);
        final Employs emp = employs_arr.get(position);


    }
}
