package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView tt;
GestoreBrano gb;
Button bt;
Spinner sp;
// crea un oggetto Brano che aggiungo alla ListView
    Button lw;
    // Popola la listView con la ArrayList della classe GestoreBrano
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.button);
        lw=(Button)findViewById(R.id.button2);
        gb=new GestoreBrano();
        tt=(TextView)findViewById(R.id.textView);
        sp=(Spinner)findViewById(R.id.spinner);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            //sullo Spinner c'e' entries che prende i valori dal'array
            public void onClick(View v) {

                gb.addBrano(tt.getText(), sp.getText());
            }
        });
    }
}