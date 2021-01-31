public class Ders {
    private String ad;
    private String donem;
    private int not;

    Ders(String ad, String donem, int not) {
        this.ad = ad;
        this.donem = donem;
        this.not = not;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getDonem() {
        return donem;
    }

    public void setDonem(String donem) {
        this.donem = donem;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }
}
