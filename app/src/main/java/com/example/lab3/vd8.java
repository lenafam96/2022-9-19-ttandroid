package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class vd8 extends AppCompatActivity {
    private EditText edtname,edtage;
    private Button btngo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vd8);
        Init();
        Action();
    }

    private void Action() {
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtname.getText().toString().equals("") && !edtage.getText().toString().equals(""))
                    Toast.makeText(vd8.this,"Tên: "+edtname.getText().toString()+" - Tuổi: "+edtage.getText().toString(),Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(vd8.this,"Không được để trống thông tin!",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void Init() {
        edtname = (EditText) this.findViewById(R.id.edtname);
        edtage = (EditText) this.findViewById(R.id.edtage);
        btngo = (Button) this.findViewById(R.id.btngo);
    }
}