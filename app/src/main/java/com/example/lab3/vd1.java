package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class vd1 extends AppCompatActivity {
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vd1);
        Init();
        Action();
    }

    private void Action() {
    }

    private void Init() {
        lv = (ListView) this.findViewById(R.id.listview);
        lv.setDivider(null);
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Yua Mikami");
        arr.add("Yui Hatano");
        arr.add("Eimi Fukada");
        arr.add("Hasumi Kurea");
        arr.add("Aoi Sora");
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,arr);
        lv.setAdapter(adapter);
    }
}