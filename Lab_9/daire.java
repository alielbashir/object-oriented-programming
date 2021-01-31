public class daire extends Sekil {
    double yaricap = 1;
    private final double PI = 3.14159265358979323846;

    daire(double x, double y) {
        super(x, y);
        System.out.println("Daire yaratildi");
    }

    daire(double x, double y, double yaricap) {
        super(x, y);
        this.yaricap = yaricap;
        System.out.println("Daire yaratildi");
    }

    public void buyut(int k) {
        this.yaricap *= k;
    }

    void sil() {
        sil(varlikID);
    }

    @Override
    double alan() {
        return PI * yaricap * yaricap;
    }

    @Override
    double cevre() {
        return 2 * PI * yaricap;
    }
}