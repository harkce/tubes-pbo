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
public class Kereta {
    private Gerbong[] daftarGerbong;
    private int jmlGerbong;
    private int maxGerbong;

    public Kereta(int maxGerbong) {
        this.maxGerbong = maxGerbong;
    }

    public Kereta() {
    }

    public int getJmlGerbong() {
        return jmlGerbong;
    }

    public void setJmlGerbong(int jmlGerbong) {
        this.jmlGerbong = jmlGerbong;
    }

    public int getMaxGerbong() {
        return maxGerbong;
    }

    public void setMaxGerbong(int maxGerbong) {
        this.maxGerbong = maxGerbong;
    }
    
    public void addGerbong(Gerbong g){
        if (jmlGerbong < maxGerbong){
            daftarGerbong[jmlGerbong]=g;
            jmlGerbong=jmlGerbong+1;
        }   
    }
    public Gerbong getGerbong(int i){
        return daftarGerbong[i];
    }
    
    public void removeGerbong(int i){
        jmlGerbong--;
    }
}
