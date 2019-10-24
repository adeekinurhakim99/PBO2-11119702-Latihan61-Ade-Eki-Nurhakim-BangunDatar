/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg61_bangundatar;

/**
 *
 * @author Ekiw
 */
public class Bola implements BangunDatar{
    private int jari;
    private double phi;
    private double i;
    
    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }
    
    public double getPhi(){
        return phi;
    }
    public void setPhi(double phi) {
        this.phi = phi;
    }
    
    public double i(){
        return i;
    }
    public double getI() {
        return i;
    }
    public void setI(double i) {
        this.i = i;
    }
    
    @Override
    public double hitungVolume(){
        return i*phi*jari*jari*jari;
    }
}
