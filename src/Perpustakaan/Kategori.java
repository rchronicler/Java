package Perpustakaan;
import java.util.List;

public class Kategori {
    private String namaKategori;
    private List<Buku> daftarBuku;

    public Kategori(String namaKategori, List<Buku> daftarBuku) {
        this.namaKategori = namaKategori;
        this.daftarBuku = daftarBuku;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}
