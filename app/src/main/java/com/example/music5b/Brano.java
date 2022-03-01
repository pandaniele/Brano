package com.example.music5b;


import java.util.Date;

public class Brano {
    private String titolo;
   private  String genere;
    private Date datapub;
    public Brano(String t, String g) {
     titolo=t;
    genere=g;
     datapub=null;

    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getGenere() {
        return genere;
    }

    public String toString(){

        String a=this.getTitolo()+" "+this.getGenere();
        //perche' non uso append???
        return a;

    }
}
