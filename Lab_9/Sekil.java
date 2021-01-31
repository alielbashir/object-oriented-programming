import java.util.ArrayList;

public abstract class Sekil {
    int varlikID;
    private static int son = 0;
    private static final ArrayList<Sekil> liste = new ArrayList<>();
    double x;
    double y;

    Sekil(double x, double y) {
        this.x = x;
        this.y = y;
        this.varlikID = son; // 0 olarak baslasin, java indis sistemiyle uyumlu olsun
        son++;
        liste.add(this);
    }

    abstract double alan();

    abstract double cevre();

    public void sil(int id) {
        liste.remove(id);
        System.out.println(id + ". obje silindi");
    }

    public void listele() {
        System.out.println("---------------BUTUN NESNELER---------------");
        for (Sekil sekil : liste) {
            System.out.println(sekil.varlikID + ". sirada yaratildi");
            System.out.println("Sekil sinifi: " + sekil.getClass().getSimpleName());
            System.out.println("X: " + sekil.x);
            System.out.println("Y: " + sekil.y + "\n");
        }
    }

    public void enUst() {
        System.out.println("---------------en ustteki nesne---------------");
        Sekil sekil = liste.get(liste.size() - 1);
        System.out.println("Sekil sinifi: " + sekil.getClass().getSimpleName());
        System.out.println("X: " + sekil.x);
        System.out.println("Y: " + sekil.y);
        System.out.println("Alan: " + sekil.alan());
        System.out.println("Cevre: " + sekil.cevre() + "\n");
    }
}