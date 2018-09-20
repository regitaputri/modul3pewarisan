/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author ASUS
 */
public class Buku {
  private String jenisbuku;
   private int jumlahbuku;
   
  
   public Buku (String jenisbuku, int jumlahbuku){
       this.jenisbuku = jenisbuku;
       this.jumlahbuku = jumlahbuku;
   }
   
   public void info(){
       System.out.println("Jenis Buku: " +this.jenisbuku);
       System.out.println("Jumlah Buku: " +this.jumlahbuku);
   }
}
