package com.example.pixabayapiprojectretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CustomeViewHolder> {

    ArrayList<Hit> data;
    Context context;

    public RecyclerAdapter(ArrayList<Hit> data , Context  context) {
        this.data = data;
        this.context = context;
    }

    public void setData(ArrayList<Hit> data){
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CustomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_layout , parent , false);
        return new CustomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomeViewHolder holder, int position) {
        Glide.with(context).load(data.get(position).largeImageURL).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class CustomeViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public CustomeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
