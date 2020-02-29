package com.example.task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapterslide2 extends RecyclerView.Adapter<RecyclerViewAdapterslide2.ViewHolder>{
    private ArrayList<slide2.RecyclerText> lang;
    private Context mcontext;

    public RecyclerViewAdapterslide2(Context mcontext, ArrayList<slide2.RecyclerText> lang) {
        this.lang = lang;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout,parent,false);


        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tv1.setText(lang.get(position).t1);
        holder.tv2.setText(lang.get(position).t2);


    }

    @Override
    public int getItemCount() {
        return lang.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv1,tv2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.textTitle);
            tv2=itemView.findViewById(R.id.textbody);
        }
    }
}
