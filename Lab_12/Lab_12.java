public class Lab_12 {

    public static void main(String[] args) {
        /* Okunacak dosya, tab karakterlerle ayrilmis oldugunu varsayilir.
        Virgullerle, veya baska ayirici karakter/string ile ayrilmasi icin
        Ogrenci class'indaki "ayirici" ozelligi degistirerek, belirlenen
        karaktere gore okumasini saglanabilir */

        String path = "Lab_12/ali_bilge.txt";
        Ogrenci ali = new Ogrenci();

        okumaTest(ali, path);
        ortalamaTest(ali);
        listeTest(ali);
    }

    static void okumaTest(Ogrenci ogrenci, String path) {
            ogrenci.dosyayiOku(path);
    }

    static void ortalamaTest(Ogrenci ogrenci) {
        ogrenci.ortalamaYazdir();
    }

    static void listeTest(Ogrenci ogrenci) {
        ogrenci.dersleriListele();
    }
}
