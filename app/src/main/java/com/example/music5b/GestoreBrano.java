package com.example.music5b;
// QESTA CLASSE VA NEL MAINACTIVITY NON NEL MAIN IN GENERALE??????
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class GestoreBrano {
ArrayList<Brano> listaBrani;
public GestoreBrano(){
    listaBrani=new ArrayList<Brano>();
}

public void addBrano( Brano b){
    listaBrani.add(b);
}

public String listaBrano(){
    //spedire all'acrivity una stringa con tutti i grani della mia list
    StringBuilder stBui= new StringBuilder();
            //CONCATENA TUTTE LE STRINGHR
    for (Brano brV :listaBrani) {
        //Brano; elemento in lista brV(puntatore a nuovo oggetto Brano) di tipo Brano  che prelevo ogni volta da arraydibrani, nuovo
        //puntatore a oggetti ad ogni for

        //brV.getTitolo()+','+brV.getGenere()
stBui.append(brV.toString());
stBui.append('\n');
//classe per concatenare tante scritte in manera piu' EFFICENTE oppure il String=String +"" etc...


    }
    return stBui.toString();
    //restituisce una stringa contenuta nell stBui con tutti i dati delle canzoni ;
}
}
