package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView tt;
Button bt;
Spinner sp;
// crea un oggetto Brano che aggiungo al'arrayList'
    Button lw;
    // Popola la listView con la ArrayList della classe GestoreBrano
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GestoreBrano gb;
        gb=new GestoreBrano();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.button);
        lw=(Button)findViewById(R.id.button2);
        tt=(TextView)findViewById(R.id.textView);
        sp=(Spinner)findViewById(R.id.spinGeneri);
        //spinner e' di tipo View

        //createForm crea arrayAdapter da array di stringhe 2) parametro.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.generi, android.R.layout.simple_spinner_item);
                                   //3) metodo di visualizzazione della scelta
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //ridondante????
sp.setAdapter(adapter);
        //applica l'adattatore allo spinner.



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            //sullo Spinner c'e' entries che prende i valori dal'array
            public void onClick(View v) {
String titolo=sp.getSelectedItem().toString();
                gb.addBrano(new Brano(tt.getText().toString(), titolo));
            }
        });



        lw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cioc=new Intent(getApplicationContext(), MainActivityDue.class);
                StringBuilder al=gb.listaBrano();
cioc.putExtra("alealeo", al);
                startActivity(cioc);
            }
        });
    }
}