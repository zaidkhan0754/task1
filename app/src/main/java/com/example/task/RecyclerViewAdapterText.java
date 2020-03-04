package com.example.task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapterText extends RecyclerView.Adapter<RecyclerViewAdapterText.ViewHolder>{
    private ArrayList<MainActivity.RecyclerText> lang;
    private Context mcontext;

    public RecyclerViewAdapterText(Context mcontext,ArrayList<MainActivity.RecyclerText> lang) {
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
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        holder.tv1.setText(lang.get(position).t1);
        holder.tv2.setText(lang.get(position).t2);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(mcontext, holder.tv1.getText(), Toast.LENGTH_SHORT).show();
                final AlertDialog.Builder alert = new AlertDialog.Builder(mcontext);
                LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

               // View v2 = inflater.inflate(R.layout.dialog ,null);
                View mview = inflater.inflate(R.layout.dialog,null);
                Button btn_cancel=(Button)mview.findViewById(R.id.btn_cancel);
                TextView t1=mview.findViewById(R.id.hinditext);
                t1.setText(holder.tv1.getText());



                alert.setView(mview);
                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(true);

               btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        alertDialog.dismiss();
                    }
                });


                Button btn_done=(Button)mview.findViewById(R.id.btn_done);

                btn_done.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        alertDialog.dismiss();
                    }
                });

                alertDialog.show();
            }
        });


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
