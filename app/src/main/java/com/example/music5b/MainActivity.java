package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    GestoreBrano gb;//??
TextView tt;
Button bt;
Spinner sp;
String[] generi= {"Pop", "Trap", "Rap"};
//array di stringhe generi che associero' all'arrayAdapter;

    private static final String TAG = "MyActivity";

Log.i(TAG, "MyClass.getView() — get item number ");

// crea un oggetto Brano che aggiungo al'arrayList'
    Button lw;
    // Popola la listView con la ArrayList della classe GestoreBrano
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//dipendenza :associazione
        gb=new GestoreBrano();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.button);
        //btnInserisci

        lw=(Button)findViewById(R.id.button2);
        tt=(TextView)findViewById(R.id.textView);
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
        sp.setAdapter(as);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            //sullo Spinner c'e' entries che prende i valori dal'array
            public void onClick(View v) {
String genere=sp.getSelectedItem().toString();
// to String restituisce il nome dell'opzione che noi abbiamo selezionato nella funzione specifica: getSeelectedItem().

                Toast.makeText(getApplicationContext(), "dato inserito", Toast.LENGTH_SHORT).show();

                gb.addBrano(new Brano(tt.getText().toString(), genere));
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
                String lista= gb.listaBrano();

                Intent cioc=new Intent(getApplicationContext(), MainActivityDue.class);


              //  Toast.makeText(getApplicationContext(), gb.listaBrano(), Toast.LENGTH_SHORT).show();
            cioc.putExtra("alealeo", lista);


                startActivity(cioc);
            }
        });
    }
}