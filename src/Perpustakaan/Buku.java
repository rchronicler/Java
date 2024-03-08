package Perpustakaan;

import java.util.List;

public class Buku {
    private String judul;
    private List<Penulis> penulis;

    public Buku(String judul, List<Penulis> penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public List<Penulis> getPenulis() {
        return penulis;
    }
}
