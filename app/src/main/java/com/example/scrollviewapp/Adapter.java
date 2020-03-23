package com.example.scrollviewapp;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.num.setText(String.valueOf(position + 1));
        if (position % 2 == 0) {
            holder.num.setTextColor(Color.GRAY);
        } else {
            holder.num.setTextColor(Color.BLUE);
        }
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView num;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            num = itemView.findViewById(R.id.number);
        }
    }
}
