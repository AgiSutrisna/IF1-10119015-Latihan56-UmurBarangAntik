/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan56.umurbarangantik;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class BarangAntik {
    private final int umur;
    
    public BarangAntik(int umur){
        this.umur = umur;
    }
    
    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : " + this.umur + " tahun");
    }
}
