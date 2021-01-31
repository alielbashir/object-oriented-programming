package Lab11;
public abstract class Personel extends Maas implements Kisi {

     String personelFak;
     String personelBölüm;
     String personelAd=ad;

    public Personel(String pA,String pF,String pB){
        this.personelAd=pA;
        this.personelFak=pF;
        this.personelBölüm=pB;
    }
    public abstract void yazdır();

    public String getPersonelBölüm() {
        return personelBölüm;
    }

    public void setPersonelBölüm(String personelBölüm) {
        this.personelBölüm = personelBölüm;
    }

    public String getPersonelFak() {
        return personelFak;
    }

    public void setPersonelFak(String personelFak) {
        this.personelFak = personelFak;
    }

    public String getPersonelAd() {
        return personelAd;
    }

    public void setPersonelAd(String personelAd) {
        this.personelAd = personelAd;
    }
}
