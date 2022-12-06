package com.example.myapplicationimages;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        

        Button btn = findViewById(R.id.btn);





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = (ImageView) findViewById(R.id.img1);
                image.setImageResource(R.drawable.my_dream_house2);
                Toast.makeText(getApplicationContext(), "My second dream house", Toast.LENGTH_SHORT).show();
                Log.i("info", "Button pressed");
            }
        });
    }
}


