package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Food> foods;

    Adapter(Context context, List<Food> foods) {
        this.foods = foods;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        Food food = foods.get(position);
        holder.pictView.setImageResource(food.getFlagResource());
        holder.nameView.setText(food.getName());
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView pictView;
        final TextView nameView;
        ViewHolder(View view){
            super(view);
            pictView = view.findViewById(R.id.pict);
            nameView = view.findViewById(R.id.name);
        }
    }
}