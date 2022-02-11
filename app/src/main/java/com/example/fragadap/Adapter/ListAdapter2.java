package com.example.fragadap.Adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fragadap.Model.RawModel;
import com.example.fragadap.R;

import java.util.ArrayList;
import java.util.Date;

public class ListAdapter2 extends ArrayAdapter<RawModel> {
    // Field
    Context context;

    // Constructor
    public ListAdapter2(Context context, int resource, ArrayList<RawModel> rawModels) {
        super(context,resource,rawModels);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        RawModel rawModel = getItem(position);

        if(v == null){
            LayoutInflater inflater = LayoutInflater.from(this.context);
            // The name_layout is the layout in which the data we are going to set via the rawModel object
            // that layout is going to be get showed in the list item.
            v = inflater.inflate(R.layout.name_layout,parent,false);

            ViewHolder.dateText = (TextView) v.findViewById(R.id.dateText);
            ViewHolder.name = (TextView) v.findViewById(R.id.name);

            ViewHolder.dateText.setText(rawModel.date.toString());
            ViewHolder.name.setText(rawModel.name);

            //v.setTag(ViewHolder);
        }

        return v;

    }

    private static class  ViewHolder {
        public static TextView dateText;
        public static TextView name;
    }
}
