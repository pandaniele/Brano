package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityDue extends AppCompatActivity {
    //dichiarare gli attributi dei controlli grafici
    TextView tt; //tutti i brani
    TextView txtitolo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_due);

        //recupera i riferimenti
        tt=(TextView)findViewById(R.id.textView2);
        txtitolo=(TextView)findViewById(R.id.textView3);



        Intent cioc=getIntent();
//recupera intent

        String lista=cioc.getStringExtra("alealeo");

        tt.setText(lista);

        //recupera extra e visualizza

    }
}