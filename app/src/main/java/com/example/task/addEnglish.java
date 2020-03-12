package com.example.task;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class addEnglish extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hindi_slid);
    }
    public void onCancel(View v)
    {
        setResult(RESULT_CANCELED);
        finish();
    }
}
