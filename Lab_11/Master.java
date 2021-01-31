package Lab11;
public class Master extends LisansUstu {

    String mOgrenciBölüm;
    String mOgrenciFak;
    String danısmanHoca;

    public Master(String böl,String fak,boolean tz,String dH) {
        this.mOgrenciBölüm=böl;
        this.mOgrenciFak=fak;
        this.tez=tz;
        this.danısmanHoca=dH;
    }

    public boolean getTez() {
        return tez;
    }

    public void setTez(boolean tez) {
        this.tez = tez;
    }

    @Override
    public void isTez(boolean tez) {
        if(tez){
            System.out.println("Öğrenci Tezli Master Programındadır.");
        }
        else{
            System.out.println("Öğrenci Tezsiz Master Programındadır.");
        }
    }

    public String getmOgrenciFak() {
        return mOgrenciFak;
    }

    public void setmOgrenciFak(String mOgrenciFak) {
        this.mOgrenciFak = mOgrenciFak;
    }

    public String getmOgrenciBölüm() {
        return mOgrenciBölüm;
    }

    public void setmOgrenciBölüm(String mOgrenciBölüm) {
        this.mOgrenciBölüm = mOgrenciBölüm;
    }

    public String getDanısmanHoca() {
        return danısmanHoca;
    }

    public void setDanısmanHoca(String danısmanHoca) {
        this.danısmanHoca = danısmanHoca;
    }

    @Override
    public void yazdır() {

        System.out.println("Ad Soyad= "+ogrenciAd);
        System.out.println("Öğrenci No= "+ogrenciNo);
        System.out.println("Fakülte= "+mOgrenciFak);
        System.out.println("Bölüm= "+mOgrenciBölüm);
        System.out.println("Danışman Hoca= "+danısmanHoca);
        System.out.println("Sınıf= "+ogrenciSınıf);
        System.out.println("Ders Adı= "+dersAdı);
        System.out.println("Ders Kredisi= "+dersKredi);
        System.out.println("Ders Kodu= "+dersKodu);

    }

    @Override
        public void benNeyim() {
            System.out.println("-------------Master Öğrencisi-------------");

    }

}
