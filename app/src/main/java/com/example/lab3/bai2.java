package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class bai2 extends AppCompatActivity {
    private GridView Gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        Init();
        Action();
    }

    private void Action() {
    }

    private void Init() {
        Gv = (GridView) this.findViewById(R.id.gridview);
//        Gv.setDivider(null);
        int[] avatar = {R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7,R.drawable.b8,R.drawable.b9};
        CustomAdapter_bai2 adapter_bai2 = new CustomAdapter_bai2(this,avatar);
        Gv.setAdapter(adapter_bai2);
    }
}