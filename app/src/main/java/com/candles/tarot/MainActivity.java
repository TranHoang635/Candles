package com.candles.tarot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

//    TextView txtHienthithongdiep;
    Button btn_join, btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvent();
    }

    private void addEvent() {
        //-------------button exit-------------//
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(1);
            }
        });

        //-------------button join-------------//
        btn_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Tarot run!!! Hãy lựa chọn cách rút nhé !!.", Toast.LENGTH_LONG).show();
            }
        });

//        btn_rut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
//                startActivity(intent);
//            }
//        });
//
//        btn_chon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity2.this,MainActivityCard.class);
//                startActivity(intent);
//            }
//        });
    }

    private void addControls() {
        btn_join = findViewById(R.id.btn_join);
        btn_exit = findViewById(R.id.btn_exit);
//        btn_rut = findViewById(R.id.btnRut);
//        btn_chon = findViewById(R.id.btn_Chon);
//        txtHienthithongdiep = findViewById(R.id.txtHienthithongdiep);
    }
}


