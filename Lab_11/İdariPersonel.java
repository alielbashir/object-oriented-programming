package Lab11;
public class İdariPersonel extends Personel {

  private   String iPersonelGorev;
  private int iPersonelTelNum;
  private String iPersonelMail;

    public İdariPersonel(String gorev, String mail,int telNum,String ad,String fak,String böl) {
        super(ad,fak,böl);
        this.iPersonelTelNum=telNum;
        this.iPersonelGorev=gorev;
        this.iPersonelMail=mail;
    }

    @Override
    public void yazdır() {
        System.out.println("Ad Soyad= "+personelAd);
        System.out.println("Fakülte= "+personelFak);
        System.out.println("Bölüm= "+personelBölüm);
        System.out.println("Görev= "+iPersonelGorev);
        System.out.println("Mail= "+iPersonelMail);
        System.out.println("Telefon Numarası= "+iPersonelTelNum);
        System.out.println("Maaş Günü= "+ maasGunu);
        System.out.println("Maaş= "+maasDegeri);
        System.out.println("Primli Maaş= "+primlimaashesapla(maasDegeri,15));

    }

    public String getiPersonelMail() {
        return iPersonelMail;
    }

    public void setiPersonelMail(String iPersonelMail) {
        this.iPersonelMail = iPersonelMail;
    }

    public int getiPersonelTelNum() {
        return iPersonelTelNum;
    }

    public void setiPersonelTelNum(int iPersonelTelNum) {
        this.iPersonelTelNum = iPersonelTelNum;
    }

    public String getiPersonelGorev() {
        return iPersonelGorev;
    }

    public void setiPersonelGorev(String iPersonelGorev) {
        this.iPersonelGorev = iPersonelGorev;
    }

    @Override
    public void benNeyim() {
        System.out.println("-------------İdari Personel-------------");
    }

}
