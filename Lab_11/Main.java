package Lab11;
public class Main {

    public static void main(String[] args) {
        Lisans ogr1=new Lisans("Mühendislik Fakültesi","Bilgisayar Mühendisliği",1);
        ogr1.ogrenciAd="Aslı Özen";
        ogr1.ogrenciNo=190201094;
        ogr1.dersAdı="Nesneye Yönelik Programlama";
        ogr1.dersKodu="MUH201";
        ogr1.dersKredi=5;
        ogr1.ogrenciSınıf=2;

        Master ogrM=new Master("Kimya","Fen Bilimleri Fakültesi",true,"Beyza Akbaş");
        ogrM.ogrenciAd="Sema Gümüş";
        ogrM.ogrenciNo=190200050;
        ogrM.dersAdı="Elektroanalitik Yöntemler";
        ogrM.ogrenciSınıf=2;
        ogrM.dersKodu="CHEM501";
        ogrM.dersKredi=6;

        Doktora ogrD=new Doktora(2,true," İnsan ve Toplum Bilimleri",true);
        ogrD.ogrenciAd="Burak Köroğlu";
        ogrD.ogrenciNo=190800054;
        ogrD.ogrenciFakLU="Sosyal Bilimler";
        ogrD.ogrenciBölümLU="Felsefe";
        ogrD.dersAdı="Araştırma Yöntemleri ve Bilimsel Etik";
        ogrD.ogrenciSınıf=1;
        ogrD.dersKodu="PHIL701";
        ogrD.dersKredi=7;

        AkademikPersonel aPers=new AkademikPersonel("Uygulamalı Matematik","arzuc.kocaeli.edu.tr",225,"Arzu Coşkun","Fen Edebiyat Fakültesi","Matematik");
        aPers.maasDegeri=7500;
        aPers.maasGunu="Her Ayın 6'sı";

        İdariPersonel iPers=new İdariPersonel("Sekreter","bilgisayar@kocaeli.edu.tr",33414141,"Resul Özkan","Mühendislik Fakültesi","Bilgisayar Mühendisliği");
        iPers.maasDegeri=5400;
        iPers.maasGunu="Her Ayın 15'i";

        iPers.benNeyim();
        iPers.yazdır();
        aPers.benNeyim();
        aPers.yazdır();
        ogr1.benNeyim();
        ogr1.yazdır();
        ogrM.benNeyim();
        ogrM.yazdır();
        ogrM.isTez(ogrM.tez);
        ogrD.benNeyim();
        ogrD.yazdır();
        ogrD.isTez(ogrD.tez);
    }


}
