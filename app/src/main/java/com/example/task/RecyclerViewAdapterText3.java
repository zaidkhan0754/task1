package com.example.task;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapterText3 extends RecyclerView.Adapter<RecyclerViewAdapterText3.ViewHolder> {
    private ArrayList<Language> lang2;
    private Context mcontext2;


    public RecyclerViewAdapterText3(Context mcontext2, ArrayList<Language> lang2) {
        this.lang2 = lang2;
        this.mcontext2 = mcontext2;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.selected_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {


        holder.tv1.setText(lang2.get(position).title);
        holder.tv2.setText(lang2.get(position).body);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mcontext2, addlanguage.class);
                i.putExtra("language", lang2.get(position));
                mcontext2.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lang2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.textTitle);
            tv2 = itemView.findViewById(R.id.textbody);
        }
    }

}
