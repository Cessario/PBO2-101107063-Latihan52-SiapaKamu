/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg101107063.latihan52.siapakamu;

/*
Nama : Cessario Sheva L.P.A
Nim  : 10117063
Kelas: IF-2
Deskripsi Program : Menampilkan Identitas
 */
public class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public void mengajarApa(){
        
        System.out.println("Saya "+nama+ " umur" +umur+ " tahun sedang mengajar matakuliah " +mataKuliah);
    }
    
    public void siapaKamu(){
        
        System.out.println("Saya Dosen");
    }
    
}
