import java.util.ArrayList;
import java.util.Collections;

class kume {
    public ArrayList<Integer> km = new ArrayList<>();
    public kume() {
    }// parametresiz constructor

    public kume(int[] a) {
        for (int eleman : a) {
            km.add(eleman);
        }
        Collections.sort(km);
    }// a dizisinin elemanlarindan olusan kume

    public kume(kume a) {
        this.km.addAll(a.km);
    }//copy constructor

    public void ekle(int a) {
        if (!km.contains(a))
            km.add(a);
        Collections.sort(km);
    }// kumeye yeni eleman ekleme

    public void yazdir() {
        if (km.isEmpty()) {
            System.out.println("{}");
            return;
        }
        System.out.print("{");
        int i;
        for (i = 0; i < km.size() - 1; i++) {
            System.out.print(km.get(i) + ", ");
        }
        System.out.println(km.get(i) + "}");
    }// kume icerigini yazdirir

    public boolean denk(kume a) {
        return a.km.size() == this.km.size();
    }// cagrici obje ile parametre objenin denk kume olup olmadigini test eder

    public boolean esit(kume a) {
        Collections.sort(a.km);
        return this.km.equals(a.km);
    } // cagrici obje ile parametre objenin esit kume olup olmadigini test eder

    public kume birlesim(kume a) {
        kume birlesimKumesi = new kume(this);
        birlesimKumesi = birlesimKumesi.fark(a);
        birlesimKumesi.km.addAll(a.km);
        Collections.sort(birlesimKumesi.km);
        return birlesimKumesi;
    }// cagrici obje ile parametre objenin bilesiminden olusan kumeyi dondurur

    public kume kesisim(kume a) {
        kume kesisimKumesi = this.fark(a);
        kesisimKumesi = this.fark(kesisimKumesi);
        return kesisimKumesi;
    } // cagrici obje ile parametre objenin kesisiminden olusan kumeyi dondurur

    public kume fark(kume a) {
        kume farkKumesi = new kume(this);
        farkKumesi.km.removeAll(a.km);
        return farkKumesi;
    }// cagrici obje ile parametre objenin farkindan olusan kumeyi dondurur

    public ArrayList<kume> altKumeler() {
        int len = (int) Math.pow(2,km.size());
        ArrayList<kume> altkumeler = new ArrayList<>();
        // bos alt kumeleri olustur
        altKume(this, altkumeler);
        altkumeler.add(this);
        return altkumeler;
    }// kumenin alt kumelerinden olusan bir ArrayList<kume> dondurur

    private void altKume(kume a, ArrayList<kume> altk) {
        kume temp;
        for (int i = a.km.size() - 1; i >= 0; i--) {
            temp = new kume(a);
            temp.km.remove(i);
            if (!varMi(temp, altk)) {
                altKume(temp, altk);
                altk.add(temp);
            }
        }
    }
    private boolean varMi(kume a, ArrayList<kume> b) {
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).esit(a)) {
                return true;
            }
        }
        return false;
    }

}

public class Lab_8 {
    public static void main(String[] args) {
        kume km = new kume();
        km.ekle(10);
        km.ekle(11);
        km.ekle(2);
        System.out.print("km = ");
        km.yazdir();
        int[] a = {1, 2, 3, 4, 5, 6};

        kume km2 = new kume(a);
        System.out.print("km2 = ");
        km2.yazdir();

        kume km3 = new kume(a);
        System.out.print("km3 = ");
        km3.yazdir();

        if (km.denk(km2))
            System.out.println("km ve km2 kumeleri denk");
        else
            System.out.println("km ve km2 kumeleri denk degil");

        if (km2.esit(km3))
            System.out.println("km2 ve km3 kumeleri esit");
        else
            System.out.println("km2 ve km3 kumeleri esit degil");

        kume sn = km.birlesim(km2);
        System.out.print("km ve km2 birlesimi = ");
        sn.yazdir();

        kume sn2 = km.kesisim(km2);
        System.out.print("km ve km2 kesisimi = ");
        sn2.yazdir();

        kume sn3 = km.fark(km2);
        System.out.print("km ve km2 farki = ");
        sn3.yazdir();

        System.out.println("km'nin alt kumeleri");
        ArrayList<kume> sonuc = km.altKumeler();
        for (int i = 0; i < sonuc.size(); i++) {
            sonuc.get(i).yazdir();
        }
    }
}
