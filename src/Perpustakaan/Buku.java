package Perpustakaan;

import java.lang.reflect.Field;
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

    public int jumlahKata() {
        // Menghitung jumlah kata dalam sinopsis
        return sinopsis.split("\\s+").length;
    }

    public static double checkSimilarity(Object obj1, Object obj2) {
        if (!obj1.getClass().equals(obj2.getClass()))
            throw new IllegalArgumentException("Objects are not the same type");
        Field[] fields = obj1.getClass().getDeclaredFields();
        double totalSimilarity = 0.0;
        int comparableFields = 0;
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value1 = field.get(obj1);
                Object value2 = field.get(obj2);
                if (value1 instanceof String str1 && value2 instanceof String str2) {
                    int maxLength = Math.max(str1.length(), str2.length());
                    if (maxLength > 0) {
                        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
                        for (int i = 0; i <= str1.length(); i++) {
                            for (int j = 0; j <= str2.length(); j++) {
                                if (i == 0) dp[i][j] = j;
                                else if (j == 0) dp[i][j] = i;
                                else {
                                    int costOfSub = str1.charAt(i - 1) == str2.charAt(j - 1) ? 0 : 1;
                                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1] + costOfSub, dp[i - 1][j] + 1),
                                            dp[i][j - 1] + 1);
                                }
                            }
                        }
                        totalSimilarity += (1.0 - (double) dp[str1.length()][str2.length()] / maxLength) * 100;
                        comparableFields++;
                    }
                }
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return comparableFields > 0 ? totalSimilarity / comparableFields : 0;
    }

    public Buku copy() {
        return new Buku(judul, penulis, sinopsis);
    }
}
