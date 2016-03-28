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
public class Tiket {
    private int idTiket;
    private int idPemesan;
    private Rute rute;

    public int getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(int idTiket) {
        this.idTiket = idTiket;
    }

    public int getIdPemesan() {
        return idPemesan;
    }

    public void setIdPemesan(int idPemesan) {
        this.idPemesan = idPemesan;
    }
    
    public void addRute(Rute rute) {
        this.rute = rute;
    }
    
    public Rute getRute() {
        return rute;
    }
    
}
