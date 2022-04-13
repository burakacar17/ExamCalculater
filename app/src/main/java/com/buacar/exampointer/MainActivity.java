package com.buacar.exampointer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText vizeNot,vizeYuzde,finallNot,finallYuzde;
    TextView vizeKatki,finallKatki,sonuc;
    Double result,result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vizeNot = findViewById(R.id.vizeNot);
        vizeYuzde = findViewById(R.id.vizeYuzde);
        finallNot = findViewById(R.id.finalNot);
        finallYuzde = findViewById(R.id.finalYuzde);

        vizeKatki = findViewById(R.id.vizeKatkisi);
        finallKatki = findViewById(R.id.finalKatkisi);
        sonuc = findViewById(R.id.sonuc);

    }

    public void vizeSave(View view){

        double a = Integer.parseInt(vizeNot.getText().toString());
        double b = Integer.parseInt(vizeYuzde.getText().toString());
        result = (b/100)*a;

        vizeKatki.setText("Vize Katkısı: "+result);


    }


    public void finalSave(View view){
        double x = Integer.parseInt(finallNot.getText().toString());
        double y = Integer.parseInt(finallYuzde.getText().toString());
        double z = y/100;
        result2 = z*x;

        finallKatki.setText("Final Katkısı: "+result2);


    }

    public void ortalamaHesap(View view){

        double last = result + result2;
        sonuc.setText("Ortalama: "+last);


    }


}