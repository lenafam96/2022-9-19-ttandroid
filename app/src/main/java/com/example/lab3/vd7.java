package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class vd7 extends AppCompatActivity {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vd7);
        Init();
        Action();
    }

    private void Action() {

    }

    private void Init() {
        spinner = (Spinner) this.findViewById(R.id.spinner1);
        String[] idol = {"Eimi Fukada","Yui Hatano","Yua Mikami","Hasumi Kurea","Aoi Sora"};
        int[] avatar = {R.drawable.fukada,R.drawable.hatano,R.drawable.mikami,R.drawable.hasumi,R.drawable.aoisora};
        CustomAdapter_VD7 adapter_vd3 = new CustomAdapter_VD7(this,idol,avatar);
        spinner.setAdapter(adapter_vd3);
    }
}