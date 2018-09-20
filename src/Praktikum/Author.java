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
public class Author extends Buku {
    private String penulis;
    //konstruktor
    public Author (String jenisbuku, String penulis, int jumlahbuku){
        super(jenisbuku, jumlahbuku);
        this.penulis = penulis;
    }
    
    //metode
    public void info(){
        System.out.println("Daftar Nama Penulis: " +this.penulis);
        super.info();
            
        }
}