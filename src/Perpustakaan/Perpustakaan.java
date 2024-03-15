package Perpustakaan;

import java.util.Arrays;
import java.util.List;

public class Perpustakaan {
    public static void main(String[] args) throws Exception {
        List<Buku> bukuTeknologi = List.of(
                new Buku("Clean Code", List.of(new Penulis("Robert C. Martin")), "Buku ini membahas tentang teknik penulisan kode yang bersih dan rapi."),
                new Buku("Refactoring", List.of(new Penulis("Martin Fowler")), "Buku ini membahas tentang teknik refactoring kode."),
                new Buku("Design Patterns",
                        List.of(new Penulis("Erich Gamma"), new Penulis("Richard Helm"), new Penulis("Ralph Johnson"),
                                new Penulis("John Vlissides")), "Buku ini membahas tentang berbagai macam pola desain yang sering digunakan dalam pemrograman."),
                new Buku("Extreme Programming Explained", List.of(new Penulis("Kent Beck")), "Buku ini membahas tentang metodologi pengembangan perangkat lunak yang cepat dan adaptif."),
                new Buku("The Pragmatic Programmer", List.of(new Penulis("Andrew Hunt"), new Penulis("David Thomas")), "Buku ini membahas tentang teknik dan prinsip dasar dalam pemrograman."));

        List<Buku> bukuFilsafat = List.of(
                new Buku("Meditations", List.of(new Penulis("Marcus Aurelius")), "Buku ini berisi pemikiran-pemikiran Marcus Aurelius yang ditulis dalam bentuk catatan pribadi."),
                new Buku("The Republic", List.of(new Penulis("Plato")), "Buku ini berisi dialog-dialog yang ditulis oleh Plato."),
                new Buku("The Prince", List.of(new Penulis("Niccolò Machiavelli")), "Buku ini berisi panduan untuk seorang penguasa."),
                new Buku("Thus Spoke Zarathustra", List.of(new Penulis("Friedrich Nietzsche")), "Buku ini berisi pemikiran-pemikiran Friedrich Nietzsche yang ditulis dalam bentuk cerita."),
                new Buku("The Myth of Sisyphus", List.of(new Penulis("Albert Camus")), "Buku ini berisi esai-esai tentang filsafat absurdisme."));

        List<Buku> bukuSejarah = List.of(
                new Buku("The Histories", List.of(new Penulis("Herodotus")), "Buku ini berisi catatan sejarah kuno yang ditulis oleh Herodotus."),
                new Buku("The Peloponnesian War", List.of(new Penulis("Thucydides")), "Buku ini berisi catatan sejarah perang Peloponnesos yang ditulis oleh Thucydides."),
                new Buku("The Decline and Fall of the Roman Empire", List.of(new Penulis("Edward Gibbon")), "Buku ini berisi catatan sejarah kejatuhan Kekaisaran Romawi yang ditulis oleh Edward Gibbon."),
                new Buku("The Histories", List.of(new Penulis("Herodotus")), "Buku ini berisi catatan sejarah kuno yang ditulis oleh Herodotus."),
                new Buku("The Histories", List.of(new Penulis("Herodotus")), "Buku ini berisi catatan sejarah kuno yang ditulis oleh Herodotus."));

        List<Buku> bukuAgama = List.of(
                new Buku("The Holy Bible", List.of(new Penulis("Multiple Authors")), "Buku ini berisi kitab suci agama Kristen."),
                new Buku("The Quran", List.of(new Penulis("Multiple Authors")), "Buku ini berisi kitab suci agama Islam."),
                new Buku("The Bhagavad Gita", List.of(new Penulis("Vyasa")), "Buku ini berisi kitab suci agama Hindu."),
                new Buku("The Book of Mormon", List.of(new Penulis("Multiple Authors")), "Buku ini berisi kitab suci agama Mormon."),
                new Buku("The Tao Te Ching", List.of(new Penulis("Laozi")), "Buku ini berisi kitab suci agama Taoisme."));

        List<Buku> bukuPsikologi = List.of(
                new Buku("Thinking, Fast and Slow", List.of(new Penulis("Daniel Kahneman")), "Buku ini membahas tentang dua sistem berpikir yang dimiliki manusia."),
                new Buku("Quiet", List.of(new Penulis("Susan Cain")), "Buku ini membahas tentang kekuatan introvert dalam dunia yang didominasi oleh ekstrovert."),
                new Buku("Predictably Irrational", List.of(new Penulis("Dan Ariely")), "Buku ini membahas tentang perilaku manusia yang tidak rasional."),
                new Buku("The Power of Habit", List.of(new Penulis("Charles Duhigg")), "Buku ini membahas tentang kebiasaan dan bagaimana kebiasaan dapat mempengaruhi hidup manusia."),
                new Buku("The Happiness Hypothesis", List.of(new Penulis("Jonathan Haidt")), "Buku ini membahas tentang bagaimana manusia mencapai kebahagiaan.")

        );

        List<Buku> bukuPolitik = List.of(
                new Buku("The Prince", List.of(new Penulis("Niccolò Machiavelli")), "Buku ini berisi panduan untuk seorang penguasa."),
                new Buku("The Republic", List.of(new Penulis("Plato")), "Buku ini berisi dialog-dialog yang ditulis oleh Plato."),
                new Buku("The Social Contract", List.of(new Penulis("Jean-Jacques Rousseau")), "Buku ini berisi pemikiran-pemikiran Jean-Jacques Rousseau tentang kontrak sosial."),
                new Buku("The Prince", List.of(new Penulis("Niccolò Machiavelli")), "Buku ini berisi panduan untuk seorang penguasa."),
                new Buku("The Communist Manifesto",
                        List.of(new Penulis("Karl Marx"), new Penulis("Friedrich Engels")), "Buku ini berisi panduan untuk seorang penguasa."));

        List<Buku> bukuFiksi = List.of(
                new Buku("1984", List.of(new Penulis("George Orwell")), "Buku ini berisi cerita fiksi tentang dunia yang dikuasai oleh pemerintahan totaliter."),
                new Buku("Brave New World", List.of(new Penulis("Aldous Huxley")), "Buku ini berisi cerita fiksi tentang dunia yang diatur oleh teknologi dan birokrasi."),
                new Buku("The Catcher in the Rye", List.of(new Penulis("J.D. Salinger")), "Buku ini berisi cerita fiksi tentang seorang remaja yang berusaha menemukan jati dirinya."),
                new Buku("To Kill a Mockingbird", List.of(new Penulis("Harper Lee")), "Buku ini berisi cerita fiksi tentang seorang pengacara yang berusaha membela seorang pria kulit hitam yang dituduh melakukan kejahatan."),
                new Buku("The Great Gatsby", List.of(new Penulis("F. Scott Fitzgerald")), "Buku ini berisi cerita fiksi tentang kehidupan sosial di Amerika Serikat pada tahun 1920-an."));


        List<Kategori> kategori = Arrays.asList(
                new Kategori("Teknologi", bukuTeknologi),
                new Kategori("Filsafat", bukuFilsafat),
                new Kategori("Sejarah", bukuSejarah),
                new Kategori("Agama", bukuAgama),
                new Kategori("Psikologi", bukuPsikologi),
                new Kategori("Politik", bukuPolitik),
                new Kategori("Fiksi", bukuFiksi)
        );

        kategori.forEach((k) -> {
        System.out.println("Daftar Buku Kategori " + k.getNamaKategori());
        for (Buku buku : k.getDaftarBuku()) {
            System.out.print("- " + buku.getJudul() + " (");
            for (int i = 0; i < buku.getPenulis().size(); i++) {
                System.out.print(buku.getPenulis().get(i).getNamaPenulis());
                if (i < buku.getPenulis().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
            System.out.println("  " + buku.getSinopsis());
        }
        System.out.println();
        });

        System.out.println("-------------------------------------");

        Alat alat = new Alat();

        // Jumlah kata
        System.out.println("Jumlah kata sinopsis buku pertama di kategori Teknologi adalah : " + alat.jumlahKata(bukuTeknologi.get(0)));
        // Kemiripan
        System.out.printf("Kemiripan buku %s dengan buku %s: %.2f%%\n", bukuTeknologi.get(0).getJudul(), bukuTeknologi.get(1).getJudul(), Alat.checkSimilarity(bukuTeknologi.get(0), bukuTeknologi.get(1)));
        // Copy
        System.out.println("Copy buku: " + alat.copy(bukuTeknologi.get(0)).getJudul());


    }
}
