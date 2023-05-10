package com.dwimahdini.program;
public class showroomMahdi {
    // deklarasikan type variabel
    private String pabrik;
    private String merek;
    private int tahunProduksi;
    
    // Konstruktor tanpa parameter
    public showroomMahdi() {
        this.pabrik = "";
        this.merek = "";
        this.tahunProduksi = 0;
    }
    
    // Konstruktor dengan parameter
    public showroomMahdi(String pabrik, String merek, int tahunProduksi) {
        this.pabrik = pabrik;
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }
    
    // Methode void=maju
    public void mobilMaju() {
        System.out.println("Mobil " + merek + " " + pabrik + " sedang maju.");
    }
    
    // Methode void=mundur
    public void mobilMundur() {
        System.out.println("Mobil " + merek + " " + pabrik + " sedang mundur.");
    } 
    // Methode non-void=berhenti
    public String mobilBerhenti() {
        return "Mobil " + merek + " " + pabrik + " sudah berhenti.";
    }
    
    public String Pabrik() {
        return pabrik;
    }
    public void Pabrik(String pabrik) {
        this.pabrik = pabrik;
    }
    public String Merek() {
        return merek;
    }
    public void Merek(String merek) {
        this.merek = merek;
    }
    public int tahunProduksi() {
        return tahunProduksi;
    }
    public void tahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
}
    // PENJELASAN = membuat class "Mobil" dengan tiga variabel: "pabrik" dan "merek"
    // bertipe data String, serta "tahunProduksi" bertipe data int. //
    // Lalu membuat dua konstruktor: satu tanpa parameter dan satu lagi dengan tiga parameter //
    // yang masing-masing bertipe data String dan integer. kita membuat class Main dan melakukan instansiasi dua objek dari class "Mobil".//
    // Lalu, kemudian memanggil methode maju,mundur, dan berhenti di masing-masing objek untuk menunjukkan operasi.//
