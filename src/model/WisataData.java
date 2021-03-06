/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import static model.ArrayDataPembeli.ArrJumlahTiket;
import static model.ArrayDataPembeli.ArrNamaPembeli;
import static model.ArrayDataPembeli.ArrNomorPembeli;
import static model.ArrayDataPembeli.ArrTanggal;
import static model.ArrayDataPembeli.ArrTotalHarga;

/**
 *
 * @author djavu
 */
public class WisataData {
    
    
    
    //data
    private ArrayList<String> namaWisata = new ArrayList<>();
    private ArrayList<String> descWisata = new ArrayList<>();
    private ArrayList<String> urlImage = new ArrayList<>();
    private ArrayList<String> harga = new ArrayList<>();

    private double jumlahTiket;
    private double hargaTiket;
    //for data pembeli
    public void setDataArray(String nama,String nomor,String jumlah,String total,String tanggal){
        ArrNamaPembeli.add(nama);
        ArrNomorPembeli.add(nomor);
        ArrJumlahTiket.add(jumlah);
        ArrTotalHarga.add(total);
        ArrTanggal.add(tanggal);
    }
    //for total
    public WisataData(double jumlahTiket,double harga){
        this.jumlahTiket = jumlahTiket;
        this.hargaTiket = harga;
    }
    //data wisata
    public WisataData() {
        //add data nama wisata
        namaWisata.add("Jatim Park 1");
        namaWisata.add("Jatim Park 2");
        namaWisata.add("Jatim Park 3");
        namaWisata.add("Museum Angkut");
        namaWisata.add("Taman Wisata Selecta");

        //add data desc wisata
        descWisata.add("Jatim Park 1 merupakan tempat wisata yang begitu populer di jawa timur. Di Jatim Park 1, Anda juga bisa memperluas wawasan tentang budaya Indonesia dan sains.");
        descWisata.add("Jatim Park merupakan tempat wisata yang memiliki tema khusus yaitu Fauna dan Flora. Ya, Jatim Park II menyajikan wisata yang sangat menarik dengan dua menu utama yaitu Batu Secret Zoo dan Eco Green Park.");
        descWisata.add("Jatim Park 3 merupakan beragam aktivitas seru, seperti kembali ke zaman dinosaurus, berpose dengan selebriti, mempelajari sejarah musik dunia, mencoba berbagai permainan, dan masih banyak lagi!");
        descWisata.add("Museum Angkut memiliki ragam koleksi kendaraan yang akan mengangkut Anda ke berbagai era! Tercatat sebagai museum transportasi pertama di Asia Tenggara, inilah tempat yang tepat untuk mencari tahu tentang berbagai macam kendaraan, mulai dari delman hingga bus tingkat.");
        descWisata.add("Taman Wisata Selecta untuk menikmati udara segar sekaligus memanjakan mata dengan hamparan bunga-bunga cantik yang berwarna warni.");

        //add image url
        urlImage.add("https://djavu16.000webhostapp.com/pbo/jatimpark1.jpg");
        urlImage.add("https://djavu16.000webhostapp.com/pbo/Jatim-Park-2.jpg");
        urlImage.add("https://djavu16.000webhostapp.com/pbo/jatimpark3.jpg");
        urlImage.add("https://djavu16.000webhostapp.com/pbo/Review%20Museum%20Angkut%20Malang%20Tiket.jpg");
        urlImage.add("https://djavu16.000webhostapp.com/pbo/selecta.jfif");
        
        //add harga
        harga.add("Rp 72.750");
        harga.add("Rp 97.000");
        harga.add("Rp 194.000");
        harga.add("Rp 97.000");
        harga.add("Rp 700.000");
    }

    public int getArraySize() {
        return namaWisata.size();
    }

    public ArrayList<String> getHarga() {
        return harga;
    }

    public ArrayList<String> getNamaWisata() {
        return namaWisata;
    }

    public ArrayList<String> getDescWisata() {
        return descWisata;
    }

    public ArrayList<String> getUrlImage() {
        return urlImage;
    }
    
    //function for tiket
//    public void setJumlahTiket(double jumlahTiket) {
//        this.jumlahTiket = jumlahTiket;
//    }
//
//    public void setHarga(double harga) {
//        this.hargaTiket = harga;
//    }
    
    public double getTotalHarga(){
        double totalHarga = jumlahTiket*hargaTiket;
        return totalHarga;
    }

}
