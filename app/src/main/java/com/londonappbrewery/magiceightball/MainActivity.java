package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView img_ball_result = findViewById(R.id.image_ball_result);

        Button ask_btn = findViewById(R.id.btn_ask);

        final int[] result_img_Array = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        ask_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random_class = new Random();

                int rand_num = random_class.nextInt(5);

                img_ball_result.setImageResource(result_img_Array[rand_num]);

            }
        });


    }
}
