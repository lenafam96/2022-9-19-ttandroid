package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class bai1 extends AppCompatActivity {
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        Init();
        Action();
    }

    private void Action() {
    }

    private void Init() {
        lv = (ListView) this.findViewById(R.id.listview);
        String[] name = {"Phan Thanh Hải","Phan Linh Vũ","Phan Ngọc Mai","Phan Văn Huy","Phan Trà My"};
        String[] phone = {"0399293342","0835832001","0976683501","0356958026","0862606342"};
        int[] avatar = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5};
        CustomAdapter_Bai1 adapter_bai1 = new CustomAdapter_Bai1(this,name,phone,avatar);
        lv.setAdapter(adapter_bai1);
    }
}