package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivityDue extends AppCompatActivity {
    //dichiarare gli attributi dei controlli grafici
    TextView tt; //tutti i brani
    TextView txtitolo;
    String tag="MainActivityDue";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_due);
        Log.d(tag,"Sono nell'Oncreate");
        //recupera i riferimenti
        tt=(TextView)findViewById(R.id.textView2);
        txtitolo=(TextView)findViewById(R.id.textView3);



        Intent cioc=getIntent();
//recupera intent

        String lista=cioc.getStringExtra("alealeo");

        tt.setText(lista);

        //recupera extra e visualizza

    }


    @Override
    protected void onResume() {
        //
        super.onResume();
        Log.d(tag,"Sono nell'OnResume");
    }

    @Override
    protected void onPause() {
        //
        super.onPause();
        Log.d(tag,"Sono nell'onPause");
    }

    @Override
    protected void onStart() {
        //
        super.onStart();
        Log.d(tag,"Sono nell'onStart");
    }

    @Override
    protected void onDestroy() {
        //
        super.onDestroy();
        Log.d(tag,"Sono nell'onDestroy");
    }

    @Override
    protected void onRestart() {
        //
        super.onRestart();
        Log.d(tag,"Sono nell'onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"Sono nell'onStop");
    }
}