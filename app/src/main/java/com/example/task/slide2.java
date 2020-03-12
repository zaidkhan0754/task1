package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class slide2 extends AppCompatActivity {
    private ArrayList<slide2.RecyclerText> language=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);
        RecyclerView programlist = (RecyclerView) findViewById(R.id.programlist);
        init1();



    }

    public  void init1(){
        language.add(new slide2.RecyclerText("Marathi / मराठी","1.मराठी लिपीमध्ये लिहा \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        language.add(new slide2.RecyclerText("Gujarati / ગુજરાતી","1. ગુજરાતી સ્ક્રિપ્ટમાં લખો  \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        language.add(new slide2.RecyclerText("Telugu / తెలుగు","1. తెలుగు లిపిలో వ్రాయండి \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        language.add(new slide2.RecyclerText("Hindi / हिंदी  ","1. हिंदी लिपि में लिखो  \n2. English to Hindi : \"kaise ho -> कैसे हो \"") );
        language.add(new slide2.RecyclerText("Marathi / मराठी","1.मराठी लिपीमध्ये लिहा \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        language.add(new slide2.RecyclerText("Gujarati / ગુજરાતી","1. ગુજરાતી સ્ક્રિપ્ટમાં લખો  \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        language.add(new slide2.RecyclerText("Telugu / తెలుగు","1. తెలుగు లిపిలో వ్రాయండి \n2. English to Gujarati : “kema cho -> કેમ છો\"") );
        recyclerinit();
    }

    public void recyclerinit(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        RecyclerView recyclerView=findViewById(R.id.programlist);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapterslide2 adapterText=new RecyclerViewAdapterslide2(slide2.this,language);
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