package Perpustakaan;

import java.util.Arrays;
import java.util.List;

public class Perpustakaan {
    public static void main(String[] args) throws Exception {
        List<Buku> bukuTeknologi = List.of(
                new Buku("Clean Code", List.of(new Penulis("Robert C. Martin"))),
                new Buku("Refactoring", List.of(new Penulis("Martin Fowler"))),
                new Buku("Design Patterns",
                        List.of(new Penulis("Erich Gamma"), new Penulis("Richard Helm"), new Penulis("Ralph Johnson"),
                                new Penulis("John Vlissides"))),
                new Buku("Extreme Programming Explained", List.of(new Penulis("Kent Beck"))),
                new Buku("The Pragmatic Programmer", List.of(new Penulis("Andrew Hunt"), new Penulis("David Thomas"))));

        List<Buku> bukuFilsafat = List.of(
                new Buku("Meditations", List.of(new Penulis("Marcus Aurelius"))),
                new Buku("The Republic", List.of(new Penulis("Plato"))),
                new Buku("The Prince", List.of(new Penulis("Niccolò Machiavelli"))),
                new Buku("Thus Spoke Zarathustra", List.of(new Penulis("Friedrich Nietzsche"))),
                new Buku("The Myth of Sisyphus", List.of(new Penulis("Albert Camus"))));

        List<Buku> bukuSejarah = List.of(
                new Buku("The Histories", List.of(new Penulis("Herodotus"))),
                new Buku("The Peloponnesian War", List.of(new Penulis("Thucydides"))),
                new Buku("The Decline and Fall of the Roman Empire", List.of(new Penulis("Edward Gibbon"))),
                new Buku("The Histories", List.of(new Penulis("Herodotus"))),
                new Buku("The Histories", List.of(new Penulis("Herodotus"))));

        List<Buku> bukuAgama = List.of(
                new Buku("The Holy Bible", List.of(new Penulis("Multiple Authors"))),
                new Buku("The Quran", List.of(new Penulis("Multiple Authors"))),
                new Buku("The Bhagavad Gita", List.of(new Penulis("Vyasa"))),
                new Buku("The Book of Mormon", List.of(new Penulis("Multiple Authors"))),
                new Buku("The Tao Te Ching", List.of(new Penulis("Laozi"))));

        List<Buku> bukuPsikologi = List.of(
                new Buku("Thinking, Fast and Slow", List.of(new Penulis("Daniel Kahneman"))),
                new Buku("Quiet", List.of(new Penulis("Susan Cain"))),
                new Buku("Predictably Irrational", List.of(new Penulis("Dan Ariely"))),
                new Buku("The Power of Habit", List.of(new Penulis("Charles Duhigg"))),
                new Buku("The Happiness Hypothesis", List.of(new Penulis("Jonathan Haidt")))

        );

        List<Buku> bukuPolitik = List.of(
                new Buku("The Prince", List.of(new Penulis("Niccolò Machiavelli"))),
                new Buku("The Republic", List.of(new Penulis("Plato"))),
                new Buku("The Social Contract", List.of(new Penulis("Jean-Jacques Rousseau"))),
                new Buku("The Prince", List.of(new Penulis("Niccolò Machiavelli"))),
                new Buku("The Communist Manifesto",
                        List.of(new Penulis("Karl Marx"), new Penulis("Friedrich Engels"))));

        List<Buku> bukuFiksi = List.of(
                new Buku("1984", List.of(new Penulis("George Orwell"))),
                new Buku("Brave New World", List.of(new Penulis("Aldous Huxley"))),
                new Buku("The Catcher in the Rye", List.of(new Penulis("J.D. Salinger"))),
                new Buku("To Kill a Mockingbird", List.of(new Penulis("Harper Lee"))),
                new Buku("The Great Gatsby", List.of(new Penulis("F. Scott Fitzgerald"))));


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
        }
        System.out.println();
        });

    }
}
