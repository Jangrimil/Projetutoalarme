package com.example.projettutoalarme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    {
        TextView sonnerie = (TextView) findViewById(R.id.cardView1);
        sonnerie.setOnClickListener(new View.OnClickListener(){
                @Override
                public void OnClick(View arg0) {
                startActivity(new Intent(MainActivity.this, sonnerie.class));
            }
        });
    }
    {
        TextView video = (TextView) findViewById(R.id.cardView3);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v) {
                startActivity(new Intent(MainActivity.this, video.class));
            }
        });
    }
    {
        TextView bluethooth = (TextView) findViewById(R.id.cardView2);
        bluethooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v) {
                startActivity(new Intent(MainActivity.this, Bluetooth.class));
            }
        });
    }
}