package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class bai4 extends AppCompatActivity {
    private Spinner spinner1;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        Init();
        Action();
    }

    private void Action() {
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int color;
                switch (spinner1.getSelectedItem().toString()){
                    case "Trắng":
                        color = R.color.white;break;
                    case "Đỏ":
                        color = R.color.red;break;
                    case "Xanh lá cây":
                        color = R.color.green;break;
                    case "Xanh dương":
                        color = R.color.blue;break;
                    default:
                        color = R.color.black;
                }
                textView2.setTextColor(getResources().getColor(color,null));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void Init() {
        spinner1 = (Spinner) this.findViewById(R.id.spinner1);
        textView2 = (TextView) this.findViewById(R.id.textView2);
        String[] color = {"Đen","Trắng","Đỏ","Xanh lá cây","Xanh dương"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, color);
        spinner1.setAdapter(adapter);
    }
}