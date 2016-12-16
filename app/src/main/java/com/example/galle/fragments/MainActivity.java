package com.example.galle.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button botonLlamar;
    Intent llamarMain2Obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llamarMain2Obj = new Intent(MainActivity.this, MainActivity2.class);
    }

    public void llamarMain2 (View view){
        startActivity(llamarMain2Obj);
    }
}
