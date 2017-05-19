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
public abstract class Club{
    protected String latihan="Persib" ;
    protected String bertanding ;
    

   protected String getLatihan(){ //membuat getter
      return latihan;
    }   
   protected String getBertanding(){ //membuat getter
        return bertanding;
    }
   public void setLatihan(String latihan){    //membuat setter
       this.latihan = latihan;
   }
   public void setBertanding(String bertanding){    //membuat setter
       this.bertanding = bertanding;
   }
    protected abstract void PrintLatihan();
    protected abstract void PrintBertanding();
}
