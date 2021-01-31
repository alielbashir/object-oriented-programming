/**
 * @author asayar
 */
public class Faktoriyal {

    private int deger;
    private int sonuc;

    /**
     * Faktoriyali bulunmak istenen
     * değeri atar
     *
     * @param deger
     */
    public void setDeger(int deger) {
        this.deger = deger;
    }

    /**
     * Faktoriyali bulunmak istenen
     * dönderir
     *
     * @return
     */
    public int getDeger() {
        return deger;
    }

    /**
     * Girilen değerin faktorial değerini Islemlerim
     * class ındaki methodları kullanarak
     * hesaplayıp sonuc parametresine yazdırır
     */
    public void hesapla() {
        double tempSonuc = 1;
        int sayac = 2;
        Islemlerim degerIslemlerim = new Islemlerim(deger);
        Islemlerim sonucIslemlerim = new Islemlerim(tempSonuc);
        Islemlerim sayacIslemlerim = new Islemlerim(sayac);
        degerIslemlerim.deger_1 = (int) degerIslemlerim.topla(1);
        if (deger == 0) {
            sonuc = 1;
        } else {
            while (degerIslemlerim.buyuktur(sayac)) {
                sonucIslemlerim.deger_1 = tempSonuc;
                tempSonuc = sonucIslemlerim.carp(sayac);
                sayac = (int) sayacIslemlerim.topla(1);
                sayacIslemlerim.deger_1 = sayac;
            }
            sonuc = (int) tempSonuc;
        }
    }

    /**
     * Degeri ve sonucu ekrana yazdırır
     */
    public void ekranaYazdir() {
        System.out.println("deger: " + deger);
        System.out.println(deger + "! = " + sonuc);
    }
}