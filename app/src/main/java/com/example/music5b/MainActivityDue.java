package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityDue extends AppCompatActivity {
    //dichiarare gli attributi dei controlli grafici
    TextView tt; //tutti i brani
    ListView sp;
    String tag="MainActivityDue";
    String[] vv= {""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_due);
        Log.d(tag,"Sono nell'Oncreate");
        //recupera i riferimenti
        tt=(TextView)findViewById(R.id.textView2);
        sp=(ListView)findViewById(R.id.ll);
        //lwFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {


        Intent cioc=getIntent();
//recupera intent

        String lista=cioc.getStringExtra("alealeo");

     //   tt.setText(lista);
        //recupera extra e visualizza

        String[] braNi = lista.split("\n");

       /* for (String bB :braNi) {
            String[] separTwo = bB.split("");
           vv
        }*/


        ArrayAdapter<String> as=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, braNi);

        //CAMBIA FONTE DI DATI?????
        sp.setAdapter(as);



        sp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String gg= (String) sp.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(), gg, Toast.LENGTH_LONG).show();
            }
        });

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