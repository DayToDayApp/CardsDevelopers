package com.raul.tarjetadeveloper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.linkedinelias)));
    startActivity(viewIntent);






}








