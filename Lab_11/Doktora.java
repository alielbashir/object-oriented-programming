package Lab11;
public class Doktora extends LisansUstu {

    private int dönem;
    private boolean masterMezunu;
    private String anaBilimDal;

    public Doktora(int dönem,boolean masterMezunu,String anaBilimDal,boolean tz) {
        this.dönem=dönem;
        this.masterMezunu=masterMezunu;
        this.anaBilimDal=anaBilimDal;
        this.tez=tz;
    }

    @Override
    public void yazdır() {
        System.out.println("Ad Soyad= "+ogrenciAd);
        System.out.println("Öğrenci No= "+ogrenciNo);
        System.out.println("Fakülte= "+ogrenciFakLU);
        System.out.println("Bölüm= "+ogrenciBölümLU);
        System.out.println("Ana Bilim Dalı= "+anaBilimDal);
        System.out.println("Sınıf= "+dönem/2);
        System.out.println("Ders Adı= "+dersAdı);
        System.out.println("Ders Kredisi= "+dersKredi);
        System.out.println("Ders Kodu= "+dersKodu);
       System.out.println("Öğrencinin Phd Ünvanını Kazanmasına "+kacDonemPhD(dönem,masterMezunu)+" dönem kalmıştır.");

    }
 public int kacDonemPhD(int dönem,boolean mMezunu){
        int kalanD;
        if(mMezunu){
            kalanD=8-dönem;
            return kalanD;
        }
        else{
            kalanD=10-dönem;
            return kalanD;
        }
 }

    @Override
    public void isTez(boolean tez) {
        if(tez){
            System.out.println("Öğrenci Tezli Doktora Programındadır.");
        }
        else{
            System.out.println("Öğrenci Tezsiz Doktora Programındadır.");
        }
    }
    public int getDönem() {
        return dönem;
    }

    public void setDönem(int dönem) {
        this.dönem = dönem;
    }

    public boolean isMasterMezunu() {
        return masterMezunu;
    }

    public void setMasterMezunu(boolean masterMezunu) {
        this.masterMezunu = masterMezunu;
    }

    public String getAnaBilimDal() {
        return anaBilimDal;
    }

    public void setAnaBilimDal(String anaBilimDal) {
        this.anaBilimDal = anaBilimDal;
    }

    @Override
    public void benNeyim() {
            System.out.println("-------------Doktora Öğrencisi-------------");
    }

}
