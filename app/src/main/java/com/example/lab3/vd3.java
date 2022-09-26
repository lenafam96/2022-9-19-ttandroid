package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class vd3 extends AppCompatActivity {
    private GridView Gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vd3);
        Init();
        Action();
    }

    private void Action() {
    }

    private void Init() {
        Gv = (GridView) this.findViewById(R.id.gridview);
//        Gv.setDivider(null);
        String[] idol = {"Eimi Fukada","Yui Hatano","Yua Mikami","Hasumi Kurea","Aoi Sora"};
        int[] avatar = {R.drawable.fukada,R.drawable.hatano,R.drawable.mikami,R.drawable.hasumi,R.drawable.aoisora};
        CustomAdapter_VD3 adapter_vd3 = new CustomAdapter_VD3(this,idol,avatar);
        Gv.setAdapter(adapter_vd3);
    }
}