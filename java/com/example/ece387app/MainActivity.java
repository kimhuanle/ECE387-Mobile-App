package com.example.ece387app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int count, btnX, btnY;
    Button btn;
    TextView click_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float dpHeight = (float)2.27 * displayMetrics.heightPixels / displayMetrics.density;
        float dpWidth = (float)2.5 * displayMetrics.widthPixels / displayMetrics.density;
        btnX = 864;
        btnY = 400;
        click_count = findViewById(R.id.click_count);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                click_count.setText(count + " Clicks!");
                Random r = new Random();
                int x = r.nextInt((int)(dpWidth - btn.getWidth())-100);
                int y = r.nextInt((int)(dpHeight - btn.getHeight())-200);
                btn.setX(x+50);
                btn.setY(y+100);
            }
        });
    }
}