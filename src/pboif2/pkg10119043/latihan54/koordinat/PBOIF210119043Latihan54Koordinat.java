/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan54.koordinat;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menentukan warna berdasarkan koordinat
 */
public class PBOIF210119043Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(0,0,"Putih");
        warnaKoordinat.setX(10);
        warnaKoordinat.setY(4);
        warnaKoordinat.setNamaWarna("Jingga");
        System.out.println("Warna Koordinat : " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + warnaKoordinat.getX() + " , y : "  + warnaKoordinat.getY());
    }
    
}
