import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Ogrenci {
    private String ad;
    private String soyAd;
    private String ogrenciNo;
    private double ortalama;

    final String ayirici = "\t";

    int enUzunDersAdi = 5;
    private static final int dersSayisi = 6;
    private Ders[] dersler = new Ders[dersSayisi];

    Ogrenci() {
    }

    Ogrenci(String ad, String soyAd, String ogrenciNo) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.ogrenciNo = ogrenciNo;
    }

    public void dosyayiOku(String path) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.err.println(path + " dosyasi bulunamadi: ");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Bir hata oldu: " + e);
            System.exit(2);
        }
        Scanner scanner = new Scanner(fileReader);

        String[] adSoyAd = scanner.nextLine().split(" ");
        ad = adSoyAd[0];
        soyAd = adSoyAd[1];
        ogrenciNo = scanner.nextLine();
        scanner.nextLine();

        List<String> line;
        double puanToplami = 0;

        for (int i = 0; i < dersSayisi; i++) {
            line = new ArrayList<>(Arrays.asList(scanner.nextLine().split(ayirici)));
            line.removeIf(word -> word.equals(""));

            puanToplami += Float.parseFloat(line.get(2));

            // Dersleri listelerken uygun bir bosluk sayisi birakmak icin
            if (line.get(0).length() > enUzunDersAdi) enUzunDersAdi = line.get(0).length();
            dersler[i] = new Ders(line.get(0), line.get(1), Integer.parseInt(line.get(2)));
        }
        // 2 basamaga yuvarla
        ortalama = Math.round(puanToplami / dersSayisi * 4) / 100.0;
    }

    public void ortalamaYazdir() {
        System.out.println(getAd() + " " + getSoyAd() + " adli ogrencinin ortalamasi: " + getOrtalama() + "/4.00");
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void dersleriListele() {
        System.out.println("\n" + getAd() + " " + getSoyAd() + " adli ogrencinin ders listesi:");
        System.out.println(String.format("%-" + (enUzunDersAdi + 3) + "s", "Ders")
                + String.format("%-" + 13 + "s", "Donem")
                + String.format("%-" + 3 + "s", "Not") + "\n");
        for (Ders ders : dersler) {
            System.out.println(String.format("%-" + (enUzunDersAdi + 3) + "s", ders.getAd())
                    + String.format("%-" + 13 + "s", ders.getDonem())
                    + String.format("%" + 3 + "s", ders.getNot()));
        }
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public Ders[] getDersler() {
        return dersler;
    }

    public void setDersler(Ders[] dersler) {
        this.dersler = dersler;
    }
}
