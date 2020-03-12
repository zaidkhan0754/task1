package com.example.task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapterText2 extends RecyclerView.Adapter<RecyclerViewAdapterText2.ViewHolder1>{
    private ArrayList<MainActivity.RecyclerText2> lang1;
    private Context mcontext1;

    public RecyclerViewAdapterText2(Context mcontext1,ArrayList<MainActivity.RecyclerText2> lang1) {
        this.lang1 = lang1;
        this.mcontext1 = mcontext1;
    }

    @NonNull
    @Override
    public ViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.key_item,parent,false);

        return new ViewHolder1(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder1 holder, int position) {

        holder.tv1.setId(R.id.space_two);
        holder.tv2.setId(R.id.second_key);
        holder.tv3.setId(R.id.textView);
    }

    @Override
    public int getItemCount() {
        return lang1.size();
    }

    public class ViewHolder1 extends RecyclerView.ViewHolder{
        TextView tv1,tv3;
        ImageView tv2;

        public ViewHolder1(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.space_two);
            tv2=itemView.findViewById(R.id.second_key);
            tv3=itemView.findViewById(R.id.textView);
        }
    }




}
