package com.example.felixits.akash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton whatbtn,mxbtn,insta,youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        whatbtn = findViewById(R.id.whatbtn);
        mxbtn = findViewById(R.id.mxbtn);
        insta = findViewById(R.id.instabtn);
        youtube = findViewById(R.id.youtube);
    }

    public void gotoWhats(View view) {
       // val i=packageManager.getLaunchIntentForPackage("com.whatsapp")
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        startActivity(intent);

    }

    public void gotoMx(View view) {
        Intent intent =getPackageManager().getLaunchIntentForPackage("com.mxtech.videoplayer.ad");
        startActivity(intent);
    }

    public void gotoYoutube(View view) {

        Intent youtube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        startActivity(youtube);
    }

    public void gotoInsta(View view) {
        Intent insta =getPackageManager().getLaunchIntentForPackage("com.instagram.android");
        startActivity(insta);
    }
}
