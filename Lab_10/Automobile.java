public class Automobile implements Arac {
    double fuel;
    double speed;
    String license;
    long girisZamani;

    public Automobile(double f, double s, String l) {
        this.setFuel(f);
        this.setSpeed(s);
        this.setLicense(l);
    }

    public Automobile(String l) {
        this.setLicense(l);
    }

    @Override
    public void hizlan(double hizlanmaOrani) {
        double yeniHiz = this.speed + hizlanmaOrani * speed;
        if (hizlanmaOrani <= 0 || 1 < hizlanmaOrani || yeniHiz >= 300) {
            System.out.println("Hiz degismedi");
        } else {
            setSpeed(yeniHiz);
        }
    }

    @Override
    public void yavasla(double yavaslamaOrani) {
        double yeniHiz = this.speed + yavaslamaOrani * speed;
        if (yavaslamaOrani <= 0 || 1 < yavaslamaOrani || 0 < yeniHiz) {
            System.out.println("Hiz degismedi");
        } else {
            setSpeed(yeniHiz);
        }
    }

    @Override
    public void stop() {
        setSpeed(0);
        System.out.println("hiz sifirlandi. Arac durdu");
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public long getGirisZamani() {
        return girisZamani;
    }

    public void setGirisZamani(long girisZamani) {
        this.girisZamani = girisZamani;
    }
}