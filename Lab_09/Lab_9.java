public class Lab_9 {
    public static void main(String[] args) {
        daire d1 = new daire(1, 1);
        daire d2 = new daire(2, 3, 2);
        dortgen dg1 = new dortgen(2, 2);
        System.out.println(d1.alan());
        System.out.println(d2.alan());
        System.out.println(dg1.alan());
        d1.enUst();
        d2.enUst();
        dg1.enUst();
        d1.listele();
        d2.sil();
        d1.listele();
    }
}