package com.mil.en2fr.recycleviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private ArrayList<DataModel> list_details;
    private LayoutInflater mInflater;


    public RecyclerViewAdapter(Context context,ArrayList<DataModel> item) {
        this.list_details=item;
        this.mInflater=LayoutInflater.from(context);


    }
    private class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,dis_mobileno;
        ImageView logo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            dis_mobileno=itemView.findViewById(R.id.mobileNo);
            logo=itemView.findViewById(R.id.logo);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=mInflater.inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            DataModel model=list_details.get(position);
            ViewHolder viewHolder=(ViewHolder) holder;
            viewHolder.logo.setBackgroundResource(model.getImage());
            viewHolder.name.setText(model.getName());
            viewHolder.dis_mobileno.setText(model.getMobilno());

    }

    @Override
    public int getItemCount() {
        return list_details.size();
    }


}
