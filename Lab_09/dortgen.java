public class dortgen extends Sekil {
    double en = 1;
    double boy = 1;

    dortgen(double x, double y) {
        super(x, y);
        System.out.println("Dortgen yaratildi");
    }

    dortgen(double x, double y, double en, double boy) {
        super(x, y);
        this.en = en;
        this.boy = boy;
        System.out.println("Dortgen yaratildi");
    }

    void sil() {
        sil(varlikID);
    }

    @Override
    double alan() {
        return boy * en;
    }

    @Override
    double cevre() {
        return en * 2 + boy * 2;
    }
}