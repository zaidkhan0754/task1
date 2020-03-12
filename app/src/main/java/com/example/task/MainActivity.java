package com.example.task;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView arrow;

    private ArrayList<RecyclerText> language=new ArrayList<>();
    private ArrayList<RecyclerText2> language1=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_main);
       // setContentView(R.layout.dialog);


init1();
//init2();

    }
    public void onButtonClick(View v)
    {
        if (v.getId() == R.id.addlang)
        {
            Intent i = new Intent(MainActivity.this,addlanguage.class);
            startActivity(i);
        }

    }










/*    public void btn_showDialog(View view){
        final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                View mview = getLayoutInflater().inflate(R.layout.dialog,null);


        Button btn_cancel=(Button)mview.findViewById(R.id.btn_cancel);


               alert.setView(mview);

                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(true);

                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        alertDialog.dismiss();
                    }
                });

                alertDialog.show();



        // Get screen width and height in pixels
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        // The absolute width of the available display size in pixels.
        int displayWidth = displayMetrics.widthPixels;
        // The absolute height of the available display size in pixels.
        int displayHeight = displayMetrics.heightPixels;

        // Initialize a new window manager layout parameters
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();

        // Copy the alert dialog window attributes to new layout parameter instance
        layoutParams.copyFrom(alertDialog.getWindow().getAttributes());

        // Set the alert dialog window width and height
        // Set alert dialog width equal to screen width 90%
        // int dialogWindowWidth = (int) (displayWidth * 0.9f);
        // Set alert dialog height equal to screen height 90%
        // int dialogWindowHeight = (int) (displayHeight * 0.9f);

        // Set alert dialog width equal to screen width 70%
        int dialogWindowWidth = (int) (displayWidth * 0.85f);
        // Set alert dialog height equal to screen height 70%
        int dialogWindowHeight = (int) (displayHeight * 0.85f);

        // Set the width and height for the layout parameters
        // This will bet the width and height of alert dialog
        layoutParams.width = dialogWindowWidth;
        layoutParams.height = dialogWindowHeight;

        // Apply the newly created layout parameters to the alert dialog window
        alertDialog.getWindow().setAttributes(layoutParams);


    }
*/


    public  void init1(){
        language.add(new RecyclerText("Hindi / हिंदी  ","1. हिंदी लिपि में लिखो  \n2. English to Hindi : \"kaise ho -> कैसे हो \"") );
        language.add(new RecyclerText(" Marathi / मराठी","1.मराठी लिपीमध्ये लिहा \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        language.add(new RecyclerText(" Gujarati / ગુજરાતી","1. ગુજરાતી સ્ક્રિપ્ટમાં લખો  \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        language.add(new RecyclerText(" Telugu / తెలుగు","1. తెలుగు లిపిలో వ్రాయండి \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        language.add(new RecyclerText(" Hindi / हिंदी  ","1. हिंदी लिपि में लिखो  \n2. English to Hindi : \"kaise ho -> कैसे हो \"") );
        language.add(new RecyclerText(" Marathi / मराठी","1.मराठी लिपीमध्ये लिहा \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        language.add(new RecyclerText(" Gujarati / ગુજરાતી","1. ગુજરાતી સ્ક્રિપ્ટમાં લખો  \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        language.add(new RecyclerText(" Telugu / తెలుగు","1. తెలుగు లిపిలో వ్రాయండి \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        recyclerinit();
    }



    public void init2(){
        language1.add(new RecyclerText2(R.id.space_two,R.drawable.bitmap,"हिंदी (Compact) "));
        language1.add(new RecyclerText2(R.id.space_one,R.drawable.bitmap,"हिंदी "));
        language1.add(new RecyclerText2(R.id.space_one,R.drawable.bitmap,"likhana - लिखना"));
        language1.add(new RecyclerText2(R.id.space_one,R.drawable.bitmap,"Marathi / मराठी"));
        language1.add(new RecyclerText2(R.id.space_one,R.drawable.bitmap,"Gujarati / ગુજરાતી"));
        language1.add(new RecyclerText2(R.id.space_one,R.drawable.bitmap,"Telugu / తెలుగు"));

        recyclerinit1();
    }

    public void recyclerinit(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);

        RecyclerView recyclerView=findViewById(R.id.programlist);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapterText adapterText=new RecyclerViewAdapterText(MainActivity.this,language);
        recyclerView.setAdapter(adapterText);
    }

    public void recyclerinit1(){

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        RecyclerView recyclerView=findViewById(R.id.keylist);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapterText2 adapterText=new RecyclerViewAdapterText2(MainActivity.this,language1);
        recyclerView.setAdapter(adapterText);

    }
    public class RecyclerText2{
        public int  V1,V2;
        public String V3;


        public RecyclerText2(int V1,int V2,String V3){
            this.V3=V3;
            this.V1=V1;
            this.V2=V2;
        }
    }


    public class RecyclerText{
        public String t1,t2;

        public RecyclerText(String t1, String t2) {
            this.t1 = t1;
            this.t2 = t2;

        }
    }
}
