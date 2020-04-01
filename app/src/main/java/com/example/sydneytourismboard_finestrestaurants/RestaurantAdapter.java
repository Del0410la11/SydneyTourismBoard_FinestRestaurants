package com.example.sydneytourismboard_finestrestaurants;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {



    private ArrayList<Restaurants> myArray;
    private RecyclerViewClickListener listener;

    public RestaurantAdapter(ArrayList<Restaurants> restaurants, RecyclerViewClickListener listener) {
        this.myArray = restaurants;
        this.listener = listener;
    }


    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView imageView;
        public TextView name, location, type;
        private RecyclerViewClickListener listener;


        public RestaurantViewHolder( View itemView, RecyclerViewClickListener listener) {
            super(itemView);
            itemView.setOnClickListener(this);

            this.listener = listener;
            this.imageView = itemView.findViewById(R.id.image);
            this.name = itemView.findViewById(R.id.name);
            location = itemView.findViewById(R.id.location);
            type = itemView.findViewById(R.id.type);


    }

        @Override
        public void onClick(View v) {

            listener.onClick(v,getAdapterPosition());
        }
    }

    @Override
    public RestaurantViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new RestaurantViewHolder(v, listener);
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        holder.name.setText(Restaurants.getName());
        holder.type.setText(Restaurants.getType());
        holder.location.setText(Restaurants.getLocation());


    }

    @Override
    public int getItemCount() {
        return myArray.size();
    }



}