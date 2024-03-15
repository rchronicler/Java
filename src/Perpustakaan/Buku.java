package Perpustakaan;

import java.util.List;

public class Buku {
    private String judul;
    private List<Penulis> penulis;
    String sinopsis = "Buku ini belum memiliki sinopsis.";

    public Buku(String judul, List<Penulis> penulis, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    public String getJudul() {
        return judul;
    }

    public List<Penulis> getPenulis() {
        return penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }

}
