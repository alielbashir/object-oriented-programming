package Lab11;
public class Lisans extends Ogrenci {

    String ogrenciFak;
    String ogrenciBölüm;
    int ogretim;

    public Lisans(String oF, String oB, int og) {
        this.ogrenciFak=oF;
        this.ogrenciBölüm=oB;
        this.ogretim=og;
    }
    public int getOgretim() {
        return ogretim;
    }

    public void setOgretim(int ogretim) {
        this.ogretim = ogretim;
    }
    public String getOgrenciBölüm() {
        return ogrenciBölüm;
    }

    public void setOgrenciBölüm(String ogrenciBölüm) {
        this.ogrenciBölüm = ogrenciBölüm;
    }

    public String getOgrenciFak() {
        return ogrenciFak;
    }

    public void setOgrenciFak(String ogrenciFak) {
        this.ogrenciFak = ogrenciFak;
    }

    @Override
    public void yazdır() {
        System.out.println("Ad Soyad= "+ogrenciAd);
        System.out.println("Öğrenci No= "+ogrenciNo);
        System.out.println("Fakülte= "+ogrenciFak);
        System.out.println("Bölüm= "+ogrenciBölüm);
        System.out.println("Öğretim= "+ogretim+". Öğretim");
        System.out.println("Sınıf= "+ogrenciSınıf);
        System.out.println("Ders Adı= "+dersAdı);
        System.out.println("Ders Kredisi= "+dersKredi);
        System.out.println("Ders Kodu= "+dersKodu);

    }

    @Override
    public void benNeyim() {
        System.out.println("-------------Lisans Öğrencisi-------------");
    }

}
