package com.nitish.broadcastreceiverex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // make some sound ....
        
    }

    @Override
    public void onBackPressed() {
        return;
    }

    @Override
    protected void onPause() {
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
        super.onPause();
    }
}
