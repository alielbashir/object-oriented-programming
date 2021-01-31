package Lab11;
public abstract class LisansUstu extends Ogrenci {
    String ogrenciFakLU;
    String ogrenciBölümLU;
     boolean tez;

    public boolean isTez() {
        return tez;
    }

    public void setTez(boolean tez) {
        this.tez = tez;
    }
    public abstract void isTez(boolean tez);

    public String getOgrenciBölümLU() {
        return ogrenciBölümLU;
    }

    public void setOgrenciBölümLU(String ogrenciBölümLU) {
        this.ogrenciBölümLU = ogrenciBölümLU;
    }

    public String getOgrenciFakLU() {
        return ogrenciFakLU;
    }

    public void setOgrenciFakLU(String ogrenciFakLU) {
        this.ogrenciFakLU = ogrenciFakLU;
    }
}
