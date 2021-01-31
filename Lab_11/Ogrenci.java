package Lab11;
public abstract class Ogrenci extends Ders implements Kisi {
 int ogrenciNo;
 String ogrenciAd=ad;
 int ogrenciSınıf;

   public abstract void yazdır();

    public int getOgrenciSınıf() {
        return ogrenciSınıf;
    }

    public void setOgrenciSınıf(int ogrenciSınıf) {
        this.ogrenciSınıf = ogrenciSınıf;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }
}
