package com.example.music5b;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    GestoreBrano gb;//??
EditText tt;
Button bt;
Spinner sp;
String[] generi= {"Pop", "Benessere", "Relax", "Anni 90", "Dance", "Amore", "Viaggi", "Jazz",
"Latina", "Soul"};
//array di stringhe generi che associero' all'arrayAdapter;
String tag ="MainActivity";


// crea un oggetto Brano che aggiungo al'arrayList'
    Button lw;
    TextView pp;
    // Popola la listView con la ArrayList della classe GestoreBrano
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //tag che metto nella ricerca del LOGCAT, e messaggio
        //nome Activity direttamente nel TAG o come stringa TAG.
        Log.d(tag,"Sono nell'Oncreate");
        //Log statico perche' non devo istanziare la classe.

//dipendenza :associazione
        gb=new GestoreBrano();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.button);
        //btnInserisci
//textViewNomeFile
        pp=(TextView)findViewById(R.id.textViewNomeFile);
        lw=(Button)findViewById(R.id.button2);
        tt=(EditText) findViewById(R.id.editTextTextPersonName);
        sp=(Spinner)findViewById(R.id.spinGeneri);
        //spinner e' di tipo View
        //createForm crea arrayAdapter da array di stringhe 2) parametro.
       /* ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.generi, android.R.layout.simple_spinner_item);

                                   //3) metodo di visualizzazione della scelta spinner.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //ridondante????
        sp.setAdapter(adapter);
        //applica l'adattatore allo spinner.
        */



        //IL PROFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
//1) activity di dove lo costruisco2) layout dell'elemento ALLO spinner ; 3) fonte di dati;
        ArrayAdapter<String> as=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generi);

        //CAMBIA FONTE DI DATI?????
        sp.setAdapter(as);

        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            //sullo Spinner c'e' entries che prende i valori dal'array
            public void onClick(View v) {
String genere=sp.getSelectedItem().toString();
// to String restituisce il nome dell'opzione che noi abbiamo selezionato nella funzione specifica: getSeelectedItem().

                Toast.makeText(getApplicationContext(), "dato inserito", Toast.LENGTH_SHORT).show();

                gb.addBrano(pp.getText().toString(), new Brano(tt.getText().toString(), genere), getApplicationContext());
                //Log.i("MainActivity","genere.toString()");
            }
        });


        //Log.d("ciao".toString());
        lw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ottenere la stringa con tutti i dati
                //instanziare u intent
                //aggiungere la stringa all'intent
                //avviare l'activity
                String lista= gb.listaBrano(pp.getText().toString(), getApplicationContext());

                Intent cioc=new Intent(getApplicationContext(), MainActivityDue.class);


              // Toast.makeText(getApplicationContext(), lista, Toast.LENGTH_SHORT).show();
            cioc.putExtra("alealeo", lista);


                startActivity(cioc);
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