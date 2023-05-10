package com.dwimahdini.program;
public class metode {
    public static void main(String[] args) {
       
        showroomMahdi metode = new showroomMahdi("TOYOTA","Avanza",2014);
        showroomMahdi metode2 = new showroomMahdi();
        metode.mobilMaju();
        metode.mobilMundur();
        System.out.println(metode.mobilBerhenti());
        
        metode2.Pabrik("TOYOTA");
        metode2.Merek("Avanza");
        metode2.tahunProduksi(2014);
        metode2.mobilMaju();
        metode2.mobilMundur();
        System.out.println(metode2.mobilBerhenti());
    }  
}
