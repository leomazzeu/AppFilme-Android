package com.example.listafilmesrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    List<Film> filmList;
    Context context;

    public RecycleViewAdapter(List<Film> filmList, Context context) {
        this.filmList = filmList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_film, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_filmName.setText(filmList.get(position).getName());
        holder.tv_filmLaunchDate.setText(String.valueOf(filmList.get(position).getDateOfLaunch()));
        Glide.with(this.context).load(filmList.get(position).getImageURL()).into(holder.iv_filmPic);
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_filmPic;
        TextView tv_filmName;
        TextView tv_filmLaunchDate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_filmPic = itemView.findViewById(R.id.iv_filmPicture);
            tv_filmLaunchDate = itemView.findViewById(R.id.tv_dateLaunch);
            tv_filmName = itemView.findViewById(R.id.tv_filmName);
        }
    }
}
