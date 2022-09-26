package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class vd6 extends AppCompatActivity {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vd6);
        Init();
        Action();
    }

    private void Action() {

    }

    private void Init() {
        spinner = (Spinner) this.findViewById(R.id.spinner1);
        String[] idol = {"Eimi Fukada","Yui Hatano","Yua Mikami","Hasumi Kurea","Aoi Sora"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, idol);
        spinner.setAdapter(adapter);

    }
}