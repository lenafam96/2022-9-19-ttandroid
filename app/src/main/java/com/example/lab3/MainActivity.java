package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnVD1,btnVD2,btnVD3,btnVD4,btnVD5,btnVD6,btnVD7,btnVD8,btnBai1,btnBai2,btnBai3,btnBai4,btnBai5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        Action();
    }

    private void Action() {
        btnVD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vd1.class);
                startActivity(intent);
            }
        });
        btnVD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vd2.class);
                startActivity(intent);
            }
        });
        btnVD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vd3.class);
                startActivity(intent);
            }
        });
        btnVD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vd4.class);
                startActivity(intent);
            }
        });
        btnVD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vd5.class);
                startActivity(intent);
            }
        });
        btnVD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vd6.class);
                startActivity(intent);
            }
        });
        btnVD7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vd7.class);
                startActivity(intent);
            }
        });
        btnVD8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vd8.class);
                startActivity(intent);
            }
        });
        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai1.class);
                startActivity(intent);
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai2.class);
                startActivity(intent);
            }
        });
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai3.class);
                startActivity(intent);
            }
        });
        btnBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai4.class);
                startActivity(intent);
            }
        });
        btnBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bai5.class);
                startActivity(intent);
            }
        });
    }

    private void Init() {
        btnVD1 = (Button) this.findViewById(R.id.btnVD1);
        btnVD2 = (Button) this.findViewById(R.id.btnVD2);
        btnVD3 = (Button) this.findViewById(R.id.btnVD3);
        btnVD4 = (Button) this.findViewById(R.id.btnVD4);
        btnVD5 = (Button) this.findViewById(R.id.btnVD5);
        btnVD6 = (Button) this.findViewById(R.id.btnVD6);
        btnVD7 = (Button) this.findViewById(R.id.btnVD7);
        btnVD8 = (Button) this.findViewById(R.id.btnVD8);
        btnBai1 = (Button) this.findViewById(R.id.btnBai1);
        btnBai2 = (Button) this.findViewById(R.id.btnBai2);
        btnBai3 = (Button) this.findViewById(R.id.btnBai3);
        btnBai4 = (Button) this.findViewById(R.id.btnBai4);
        btnBai5 = (Button) this.findViewById(R.id.btnBai5);
    }
}