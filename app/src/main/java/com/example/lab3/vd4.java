package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class vd4 extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vd4);
        Init();
        Action();
    }

    private void Action() {
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] cl = {Color.GREEN,Color.RED,Color.BLUE,Color.BLACK,Color.YELLOW,Color.MAGENTA};
                tv.setTextColor(cl[new Random().nextInt(5)]);
            }
        });
    }

    private void Init() {
        tv = (TextView) this.findViewById(R.id.textview);
        
    }
}