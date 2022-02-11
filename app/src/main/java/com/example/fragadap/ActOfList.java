package com.example.fragadap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.fragadap.Adapter.ListAdapter2;
import com.example.fragadap.Model.RawModel;

import java.util.ArrayList;
import java.util.Date;

public class ActOfList extends AppCompatActivity {

    ListView listView;
    ListAdapter listAdapter;

    String[] listOfArray = {"1","2"}; // this 
    ArrayList<RawModel> rawModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_of_list);

        rawModel = new ArrayList<RawModel>(); // This array is going to contain the Objects of the RawModel Class

        for(int i = 0; i<listOfArray.length;i++){
            RawModel raw = new RawModel("hello there", new Date()); // passing the data into the constructor and making new objects
            rawModel.add(raw); // adding the class instances or objects into the array.
        }

        listView = (ListView) findViewById(R.id.listViewWord); // List View

        // The ArrayList of RawModel Objects passed in ListAdapter2 - ListAdapter2 the custom ArrayAdapter
        listAdapter = new ListAdapter2(this, R.layout.name_layout, rawModel);


        listView.setAdapter(listAdapter);

    }
}