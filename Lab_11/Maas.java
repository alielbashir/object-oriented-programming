package Lab11;
public class Maas {
    int maasDegeri;
    String maasGunu;
    int prim;

    public int primlimaashesapla(int maas,int prim){
        maas=maas+(maas*prim)/100;
        return maas;
    }

    public int getPrim() {
        return prim;
    }

    public void setPrim(int prim) {
        this.prim = prim;
    }

    public String getMaasGunu() {
        return maasGunu;
    }

    public void setMaasGunu(String maasGunu) {
        this.maasGunu = maasGunu;
    }

    public int getMaasDegeri() {
        return maasDegeri;
    }

    public void setMaasDegeri(int maasDegeri) {
        this.maasDegeri = maasDegeri;
    }
}
