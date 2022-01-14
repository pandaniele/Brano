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

public void addBrano(   String t, String h){
       Brano b= new Brano(t, h);
    listaBrani.add(b);
}
}
