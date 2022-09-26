package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class vd2 extends AppCompatActivity {
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vd2);
        Init();
        Action();
    }

    private void Action() {
    }

    private void Init() {
        lv = (ListView) this.findViewById(R.id.listview);
        lv.setDivider(null);
        String[] idol = {"Eimi Fukada","Yui Hatano","Yua Mikami","Hasumi Kurea","Aoi Sora"};
        int[] avatar = {R.drawable.fukada,R.drawable.hatano,R.drawable.mikami,R.drawable.hasumi,R.drawable.aoisora};
        CustomAdapter_VD2 adapter_vd2 = new CustomAdapter_VD2(this,idol,avatar);
        lv.setAdapter(adapter_vd2);
    }
}