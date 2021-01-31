import java.util.Scanner;

public class Lab_2 {
	public static void main(String[] args) {
    	calisma1();
    	calisma2();
	}
	
	public static void calisma1() {
		System.out.println("----------------Calisma 1----------------");

    	double x, cevap;
    	Scanner scanner = new Scanner(System.in);

        System.out.print("x degerini giriniz: ");
        x = scanner.nextDouble();
        cevap = 4*(x*x) - 8*x + 16;
        System.out.println("x              = " + x + "\n4x^2 - 8x + 16 = " + cevap);
	}
	public static void calisma2() {
		System.out.println("----------------Calisma 2----------------");

    	int kalan;
  
		int[] para = {50, 25, 10, 5};
		int kagitlar = 0;
		
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Bir deger giriniz: ");
        kalan = scanner.nextInt();
    	for (int i = 0; i < 4; i++) {
    		kagitlar += kalan / para[i];
    		kalan %= para[i];
    	}
        System.out.println(kagitlar + " kagit para verdiniz | " + kalan + " TL'nizi yedim :)");
	}
}
