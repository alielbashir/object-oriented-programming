import java.util.Vector;

public class Autopark {
    Vector<Automobile> sayarpark;
    static long otoparkKasasi = 0;

    Autopark(int size) {
        setSayarpark(new Vector<>(size));
    }

    public static void main(String[] args) throws InterruptedException {
        Autopark park = new Autopark(1);
        Automobile a = new Automobile("41 BR 123");
        Automobile b = new Automobile("34 TR 456 ");
        park.girisYap(a); // a otoparka giris yapiyor
        Thread.sleep(200); // 200 milisaniye zaman geçiyor.
        park.girisYap(b); // b otoparka giris yapiyor
        Thread.sleep(999); // 999 milisaniye zaman geçiyor
        park.cikisYap(b);  // b otoparktan cikiyor
        park.cikisYap(a); // a otoparktan çıkıyor –aslında yukarda kapasitededen dolayı giremediği için
        //(park edemedi) araç bulunamadı yaziyo
        kasaBilgi();
    }

    public void girisYap(Automobile oto) {
        // 1 araba eklenecegi zaman otopark kapasitesini gececekse
        if (this.sayarpark.capacity() < this.sayarpark.size() + 1) {
            System.out.println(oto.getLicense() + " park edemedi");
        } else {
            this.sayarpark.add(oto);
            oto.setGirisZamani(System.currentTimeMillis());
            System.out.println(oto.getLicense() + " otoparka girdi. Otopark kapasitesi ve boyutu "
                    + sayarpark.capacity() + ", " + sayarpark.size());
        }
    }

    public void cikisYap(Automobile oto) {
        if (!sayarpark.contains(oto)) {
            System.out.println("Arac bulunamadi");
        } else {
            long kalinanZaman = System.currentTimeMillis() - oto.getGirisZamani();
            long eklenecek = (long) ((kalinanZaman / 100f) * 10);
            setOtoparkKasasi(otoparkKasasi + eklenecek);
            sayarpark.remove(oto);
            System.out.print(oto.getLicense() + " otoparktan " + kalinanZaman + " millisaniye sonra cikti. ");
            System.out.println("Kasaya eklenecek tutar = " + eklenecek);
        }
    }

    public static void kasaBilgi() {
        System.out.println("Kasada " + getOtoparkKasasi() + " TL bulunuyor");
    }

    public int recursiveTopl(int n) {
        if (n == 1) {
            return 1;
        }
        return 3 * recursiveTopl(n / 2);
    }

    public Vector<Automobile> getSayarpark() {
        return sayarpark;
    }

    public void setSayarpark(Vector<Automobile> sayarpark) {
        this.sayarpark = sayarpark;
    }

    public static long getOtoparkKasasi() {
        return otoparkKasasi;
    }

    public static void setOtoparkKasasi(long otoparkKasasi) {
        Autopark.otoparkKasasi = otoparkKasasi;
    }
}