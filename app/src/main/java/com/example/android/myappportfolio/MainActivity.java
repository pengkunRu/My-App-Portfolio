package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionSpotifyStreamer(View view){
        Toast.makeText(this,"This button will launch my Media Streamer app",Toast.LENGTH_SHORT).show();
    }

    public void actionScoresApp(View view){
        Toast.makeText(this,"This button will launch my Score app",Toast.LENGTH_SHORT).show();
    }

    public void actionLibaryApp(View view){
        Toast.makeText(this,"This button will launch my Library app",Toast.LENGTH_SHORT).show();
    }

    public void actionBuildItBigger(View view){
        Toast.makeText(this,"This button will launch my Build It Bigger app",Toast.LENGTH_SHORT).show();
    }

    public void actionXyzReader(View view){
        Toast.makeText(this,"This button will launch my Reader app",Toast.LENGTH_SHORT).show();
    }

    public void actionMyOwnApp(View view){
        Toast.makeText(this,"This button will launch my own app",Toast.LENGTH_SHORT).show();
    }
}
