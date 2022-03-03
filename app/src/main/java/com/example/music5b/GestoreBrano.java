package com.example.music5b;
// QESTA CLASSE VA NEL MAINACTIVITY NON NEL MAIN IN GENERALE??????
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class GestoreBrano {
ArrayList<Brano> listaBrani;
GestoreFile gf;
public GestoreBrano(){
    listaBrani=new ArrayList<Brano>();
   gf=new GestoreFile();
}

public void addBrano( String h, Brano b, Context c){

    StringBuilder g= new StringBuilder();
    g.append(b.getTitolo());
    g.append(",");
    g.append(b.getGenere());
    g.append('\n');
    gf.scriviFile( h,g.toString(),c);
    //nome,genere \n


}

public String listaBrano(String h, Context c){

    String stringa=gf.readFile(h,c);

    String[] separated = stringa.split("\n");

    for (String mmV :separated) {
        String[] separTwo = mmV.split(",");
Brano b= new Brano(separTwo[0], separTwo[1]);

            listaBrani.add(b);
    }


    //spedire all'acrivity una stringa con tutti i grani della mia list
    StringBuilder stBui= new StringBuilder();
            //CONCATENA TUTTE LE STRINGHR
    for (Brano brV :listaBrani) {
        //Brano; elemento in lista brV(puntatore a nuovo oggetto Brano) di tipo Brano  che prelevo ogni volta da arraydibrani, nuovo
        //puntatore a oggetti ad ogni for

        //brV.getTitolo()+','+brV.getGenere()
stBui.append(brV.toString());
stBui.append('\n');
// nome genere \n
//classe per concatenare tante scritte in manera piu' EFFICENTE oppure il String=String +"" etc...


    }
    return stBui.toString();
    //restituisce una stringa contenuta nell stBui con tutti i dati delle canzoni ;
}
}
