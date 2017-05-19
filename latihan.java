/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapintergation;

/**
 *
 * @author 8.1
 */

public class latihan {
   
     private String nama; //menset atribut menjadi private
     private int  durasi;  //menset atribut menjadi private
    
   public String getNama(){ //membuat getter
       return nama;
   }
   public int getDurasi(){
       return durasi;
   }
   public void setNama(String nama){    //membuat setter
       this.nama = nama;
   }
   public void setDurasi(int durasi){
       this.durasi = durasi;
   }
   
   public void isilatihan(){ 
   
       latihan dat = new latihan();
        dat.setNama("Latihan Pasing"); //mengisi atribut nana dengan setNama 
        dat.setDurasi(30);    //mwngisi atribut cabang dengan setCAbang
       
        System.out.println("Nama Latihan    : "+dat.getNama()); //menampilkan dengan getter atribut nama
        System.out.println("Durasi Latihan  : "+dat.getDurasi()+" menit"); //menampilkan dengan geter atribut cabang
    }
}
