package com.mil.en2fr.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerViewAdapter adapter;
    ArrayList<DataModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recucler_View);

        int[] image={
            R.drawable.logo,
                R.drawable.logo,
                R.drawable.logo,

        };

        String[] name={
                "Paras",
                "paras",
                "paras"
        };
        String[] mobileNo={
                "7046869735",
                "7046869735",
                "7046869735",
        };
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        data=new ArrayList<DataModel>();
        for (int i=0;i<name.length;i++){
            data.add(new DataModel(image[i],name[i],mobileNo[i]));
        }
        adapter=new RecyclerViewAdapter(this,data);
        recyclerView.setAdapter(adapter);
    }
}