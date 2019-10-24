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
public class Tabung implements BangunDatar{
    private int jari;
    private int tinggi;
    private double phi ;
    
    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }
    
    public int getTinggi(){
         return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getPhi(){
        return phi;
    }
    public void setPhi(double phi) {
        this.phi = phi;
    }
    
    @Override
    public double hitungVolume(){
        return phi*jari*jari*tinggi;
    }
}
