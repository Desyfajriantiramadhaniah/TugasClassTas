/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasclasstas;

/**
 *
 * @author my computer
 */
public class Tas {
    String jenis;
    String bahan;
    String warna;
    String merk;
    String harga; 
    
    void cetakInfo(){
        System.out.println("Botol      :"+jenis);
        System.out.println("Volume Air :"+bahan);
        System.out.println("Rasa       :"+warna);
        System.out.println("Warna      :"+merk);
        System.out.println("Harga      :"+harga);
    }
}
