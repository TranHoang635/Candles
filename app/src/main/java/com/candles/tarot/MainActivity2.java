package com.candles.tarot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtHienthithongdiep;
    Button btnRut, btn_Chon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addControls();
        addEvents();
    }

    private void addControls() {
        btn_Chon = findViewById(R.id.btn_Chon);
        btnRut = findViewById(R.id.btnRut);
        txtHienthithongdiep = findViewById(R.id.txtHienthithongdiep);
    }

    private void addEvents() {
        btnRut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        btn_Chon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivityCard.class);
                startActivity(intent);
            }
        });
    }
}