package com.example.task;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<RecyclerText> language=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        RecyclerView programlist = (RecyclerView) findViewById(R.id.programlist);
init1();



    }


    public void btn_showDialog(View view){
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

//        Window window = myDialog.getWindow();
//       mview.setLayout(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

    }



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

    public void recyclerinit(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        RecyclerView recyclerView=findViewById(R.id.programlist);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapterText adapterText=new RecyclerViewAdapterText(MainActivity.this,language);
        recyclerView.setAdapter(adapterText);
    }


    public class RecyclerText{
        public String t1,t2;

        public RecyclerText(String t1, String t2) {
            this.t1 = t1;
            this.t2 = t2;

        }
    }
}
