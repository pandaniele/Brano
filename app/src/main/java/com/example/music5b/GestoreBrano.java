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
public StringBuilder listaBrano(){
    //spedire all'acrivity una stringa con tutti i grani della mia list
    StringBuilder stBui= new StringBuilder();
            //CONCATENA TUTTE LE STRINGHR
    for (Brano brV :listaBrani) {

        //brV.getTitolo()+','+brV.getGenere()
stBui.append(brV.toString()+'\n');


    }
    return stBui;
}
}
