package Lab11;
public class AkademikPersonel extends Personel {
    private String aPersonelAnaBilimDalı;
    private int aPersonelOdaNo;
    private String aPersonelMail;
    public AkademikPersonel(String aBilim,String mail,int odaNo,String ad,String fak,String böl) {
        super(ad,fak,böl);
        this.aPersonelOdaNo=odaNo;
        this.aPersonelAnaBilimDalı=aBilim;
        this.aPersonelMail=mail;
    }
    public void yazdır() {
        System.out.println("Ad Soyad= "+personelAd);
        System.out.println("Fakülte= "+personelFak);
        System.out.println("Bölüm= "+personelBölüm);
        System.out.println("Ana Bilim Dalı= "+aPersonelAnaBilimDalı);
        System.out.println("Mail= "+aPersonelMail);
        System.out.println("Oda Kodu= "+aPersonelOdaNo);
        System.out.println("Maaş Günü= "+ maasGunu);
        System.out.println("Maaş= "+maasDegeri);
        System.out.println("Primli Maaş= "+primlimaashesapla(maasDegeri,15));

    }
    public String getaPersonelMail() {
        return aPersonelMail;
    }

    public void setaPersonelMail(String aPersonelMail) {
        this.aPersonelMail = aPersonelMail;
    }

    public int getaPersonelOdaNo() {
        return aPersonelOdaNo;
    }

    public void setaPersonelOdaNo(int aPersonelOdaNo) {
        this.aPersonelOdaNo = aPersonelOdaNo;
    }

    public String getaPersonelAnaBilimDalı() {
        return aPersonelAnaBilimDalı;
    }

    public void setaPersonelAnaBilimDalı(String aPersonelAnaBilimDalı) {
        this.aPersonelAnaBilimDalı = aPersonelAnaBilimDalı;
    }

    @Override
    public void benNeyim() {
        System.out.println("-------------Akademik Personel-------------");
    }
}
