package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    Button b2;
    ImageView i1;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2 = findViewById(R.id.button2);
        i1 = findViewById(R.id.imageView);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = 1 + random.nextInt(6);
//                int number = 1;
                if (number==1){
                    i1.setImageResource(R.drawable.dice_six_faces_one);
                } else if (number == 2) {
                    i1.setImageResource(R.drawable.dice_six_faces_two);
                } else if (number == 3) {
                    i1.setImageResource(R.drawable.dice_six_faces_three);
                } else if (number == 4) {
                    i1.setImageResource(R.drawable.dice_six_faces_four);
                } else if (number == 5) {
                    i1.setImageResource(R.drawable.dice_six_faces_five);
                } else if (number == 6) {
                    i1.setImageResource(R.drawable.dice_six_faces_six);
                }
            }
        });
    }
}