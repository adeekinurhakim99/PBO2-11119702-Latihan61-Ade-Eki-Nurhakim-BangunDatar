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
public class hitungVolume {
  public static void main(String[] args) {
        Bola b = new Bola();
        b.setJari(7);
        b.setPhi(22/7);
        b.setI(4/3);
        System.out.println("Volume Bola :" + b.hitungVolume());
        
        Tabung t = new Tabung();
        t.setJari(10);
        t.setTinggi(21);
        t.setPhi(22/7);
        System.out.println("Volume Tabung :" + t.hitungVolume());
        
        Kerucut k = new Kerucut();
        k.setJari(10);
        k.setTinggi(21);
        k.setPhi(22/7);
        k.setI(1/3);
        System.out.println("Volume Tabung :" + k.hitungVolume());
    }  
}
