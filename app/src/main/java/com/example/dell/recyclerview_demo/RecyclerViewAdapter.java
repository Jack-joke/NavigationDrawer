package com.example.dell.recyclerview_demo;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<Human>mList;

    public RecyclerViewAdapter(Context mContext, ArrayList<Human> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.cus_img);
            text =itemView.findViewById(R.id.cus_text);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View humanView = inflater.inflate(R.layout.item_row, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(humanView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Human human = mList.get(i);
        Glide.with(mContext).load(human.getmImage()).into(viewHolder.img);
        viewHolder.text.setText(human.getmName());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


}
