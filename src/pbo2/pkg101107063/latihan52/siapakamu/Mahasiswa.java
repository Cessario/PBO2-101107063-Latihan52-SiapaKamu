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
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void kelasApa(){
        System.out.println("Saya"+nama+" "+umur+" Tahun Sedang Belajar di kelas "+kelas );
    }

    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");   
    }
}
