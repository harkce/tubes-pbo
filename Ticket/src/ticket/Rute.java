/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author habib
 */
public class Rute {
    private Stasiun stasiun1;
    private Stasiun stasiun2;
    private int idRute;    
    
    public void setStasiun1(Stasiun s){
        stasiun1=s;
    }
    
    public void setStasiun2(Stasiun s){
        stasiun2=s;
    }
    
    public Stasiun getStasiun1(){
        return stasiun1;
    } 
    
    public Stasiun getStasiun2(){
        return stasiun2;
    } 
    
    public void setIdRute(int idRute){
        this.idRute=idRute;
    }
    
    public int getIdRute(){
        return this.idRute;
    }
}
