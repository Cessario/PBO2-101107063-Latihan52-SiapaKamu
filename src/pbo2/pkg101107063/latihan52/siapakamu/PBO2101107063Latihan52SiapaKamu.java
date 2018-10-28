/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg101107063.latihan52.siapakamu;

/**
 *
 * @author Deadpool
 */
public class PBO2101107063Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dose = new Dosen();
        dose.setNip("41227829930");
        dose.setNama("Rizki Adam Kurniawan");
        dose.setMataKuliah("PBO");
        dose.setUmur(27);
        System.out.println("NIP DOSEN : " +dose.getNip());
        dose.siapaKamu();
        dose.mengajarApa();
        
        System.out.println("");
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10110269");
        mhs.setNama("Nindi");
        mhs.setKelas("PBO2");
        mhs.setUmur(17);
        System.out.println("NIM MAHASISWA : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
        
        
        
        
        
                
        
    }
    
}
