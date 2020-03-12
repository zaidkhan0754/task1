package com.example.task;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
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

        final ArrayList<MainActivity.RecyclerText2> language1=new ArrayList<>();

        holder.tv1.setText(lang.get(position).t1);
        holder.tv2.setText(lang.get(position).t2);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder alert = new AlertDialog.Builder(mcontext);
                LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View mview = inflater.inflate(R.layout.dialog,null);
                TextView t1=mview.findViewById(R.id.hinditext);
                RecyclerView recyclerView =mview.findViewById(R.id.keylist);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mcontext,LinearLayoutManager.VERTICAL,false);

                language1.add(new MainActivity.RecyclerText2(R.id.space_two,R.drawable.bitmap,"हिंदी (Compact) "));
                language1.add(new MainActivity.RecyclerText2(R.id.space_one,R.drawable.bitmap,"हिंदी "));
                language1.add(new MainActivity.RecyclerText2(R.id.space_one,R.drawable.bitmap,"likhana - लिखना"));
                language1.add(new MainActivity.RecyclerText2(R.id.space_one,R.drawable.bitmap,"Marathi / मराठी"));
                language1.add(new MainActivity.RecyclerText2(R.id.space_one,R.drawable.bitmap,"Gujarati / ગુજરાતી"));
                language1.add(new MainActivity.RecyclerText2(R.id.space_one,R.drawable.bitmap,"Telugu / తెలుగు"));
                recyclerView.setLayoutManager(linearLayoutManager);
                RecyclerViewAdapterText2 adapterText=new RecyclerViewAdapterText2(mcontext,language1);
                recyclerView.setAdapter(adapterText);
                t1.setText(holder.tv1.getText());








                alert.setView(mview);
                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(true);
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));



                Button btn_cancel=(Button)mview.findViewById(R.id.btn_cancel);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        alertDialog.dismiss();
                    }
                });


                Button btn_add=(Button)mview.findViewById(R.id.btn_add);
                btn_add.setOnClickListener(new View.OnClickListener() {
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
