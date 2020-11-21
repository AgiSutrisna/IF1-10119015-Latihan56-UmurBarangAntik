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
public class Radio extends BarangAntik {
    private String name;
    
    public Radio(int umur){
        super(umur);
    }
    
    public String grtName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
