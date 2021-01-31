/**
 * @author asayar
 */
public class Daire {
    // Class parametreleri
    public double PI = 3.14;
    public int yaricap;
    private final Islemlerim piIslemlerim;
    private final Islemlerim yaricapIslemlerim;
    private Islemlerim cevreIslemlerim;

    /**
     * Constructor
     *
     * @param yaricap Dairenin yarıçapı
     */
    public Daire(int yaricap) {
        this.yaricap = yaricap;
        piIslemlerim = new Islemlerim(PI);
        yaricapIslemlerim = new Islemlerim(yaricap);
    }

    /**
     * Dairenin alanını Islemlerim class ındaki
     * methodları kullanarak hesaplar
     *
     * @return alanı double cinsinden dondurur
     */
    public double alanHesapla() {
        double r2 = yaricapIslemlerim.carp(yaricap);
        return piIslemlerim.carp(r2);
    }

    /**
     * Dairenin çevresini Islemlerim class ındaki
     * methodları kullanarak hesaplar
     *
     * @return cevreyi double cinsinden dondurur
     */
    public double cevreHesapla() {
        double ikiPi = piIslemlerim.carp(2);
        return yaricapIslemlerim.carp(ikiPi);
    }

    /**
     * Bir dairenin cevresinin alanından büyüyk
     * olup olmadığını Islemlerim class ındaki
     * methodları kullanarak belirler
     *
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanBuyuktur() {
        if (cevreIslemlerim == null)
            cevreIslemlerim = new Islemlerim(cevreHesapla());
        return cevreIslemlerim.buyuktur(alanHesapla());
    }

    /**
     * Bir dairenin cevresinin alanından küçük
     * olup olmadığını ıslemlerim class ındaki
     * methodları kullanarak belirler
     *
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanKucuktur() {
        if (cevreIslemlerim == null)
            cevreIslemlerim = new Islemlerim(cevreHesapla());
        return cevreIslemlerim.kucuktur(alanHesapla());
    }

    /**
     * Dairenin alanını ve çevresini ekrana yazdırır.
     */
    public void ekranaYazdir() {
        System.out.println("\nyaricap: " + yaricap);
        System.out.println("cevre = " + cevreHesapla());
        System.out.println("alan = " + alanHesapla());
        if (cevreAlandanBuyuktur())
            System.out.println("cevre alandan buyuktur");
        else if (cevreAlandanKucuktur())
            System.out.println("cevre alandan kucuktur");
        else
            System.out.println("cevre alana esittir");
    }
}