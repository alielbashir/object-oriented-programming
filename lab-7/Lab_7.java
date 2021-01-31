import java.util.Scanner;

/**
 * @author asayar
 */
public class Lab_7 {
    public static void main(String[] args) {
        double x = 3.1;
        double y = 3;
        int r = 2;
        int a = 4;
        int b = 10;

        islemlerimTest(x, y);
        daireTest(r);
        faktoriyalTest(a, b);
    }

    private static void islemlerimTest(double x, double y) {
        System.out.println("-----------------ISLEMLERIM TESTI-----------------\n");
        Islemlerim islemlerim = new Islemlerim(x);
        System.out.println("deger 1: " + x);
        System.out.println("deger 2: " + y);
        System.out.println("topla = " + islemlerim.topla(y));
        System.out.println("cikar = " + islemlerim.cikar(y));
        System.out.println("carp = " + islemlerim.carp(y));
        System.out.println("bol = " + islemlerim.bol(y));
        System.out.println("buyuktur = " + islemlerim.buyuktur(y));
        System.out.println("kucuktur = " + islemlerim.kucuktur(y));
        System.out.println("esittir = " + islemlerim.esittir(y));
    }

    private static void daireTest(int r) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------DAIRE TESTI-----------------\n");
        System.out.print("tamsayi seklinde istediginiz dairenin yaricapini girin: ");
        int yaricap = scanner.nextInt();
        Daire kullaniciDairesi = new Daire(yaricap);
        Daire programDairesi = new Daire(r);
        System.out.println("----------------Daire 1----------------");
        kullaniciDairesi.ekranaYazdir();
        System.out.println("----------------Daire 2----------------");
        programDairesi.ekranaYazdir();
    }

    private static void faktoriyalTest(int a, int b) {
        System.out.println("-----------------FAKTORIYAL TESTI-----------------\n");
        Faktoriyal faktoriyal = new Faktoriyal();
        faktoriyal.setDeger(a);
        faktoriyal.hesapla();
        faktoriyal.ekranaYazdir();
        faktoriyal.setDeger(b);
        faktoriyal.hesapla();
        faktoriyal.ekranaYazdir();
    }
}
