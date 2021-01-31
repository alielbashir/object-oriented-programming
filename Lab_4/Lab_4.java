import java.util.Arrays;
import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        calisma1();
        calisma2();
    }

    private static void calisma1() {
        System.out.println("--------------Calisma 1--------------");
        int[][] A = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("9 sayiyi giriniz:");
        //2 boyutlu arraya atama
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        int min = A[0][0];
        int max = A[0][0];

        //2 boyutlu arrayde deger karsilastirma
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] < min) {
                    min = A[i][j];
                } else if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("en kucuk:" + min + "\nen buyuk:" + max);
        System.out.println("arasindaki fark: " + (max - min));
    }

    private static void calisma2() {
        System.out.println("--------------Calisma 2--------------");
        int[] A = new int[10];
        int ciftSayisi = 0;
        int tekSayisi = 0;
        System.out.print("10 sayiyi giriniz:");
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++){
            A[i] = scanner.nextInt();
        }

        //arraylarda bos elemanlar olmamasi icin
        for (int i = 0; i < 10; i++){
            if (A[i] % 2 == 0)
                ciftSayisi++;
            else
                tekSayisi++;
        }
        int[] B = new int[ciftSayisi];
        int[] C = new int[tekSayisi];
        int b = 0;
        int c = 0;
        for (int i = 0; i < 10; i++){
            if (A[i] % 2 == 0)
                B[b++] = A[i];
            else
                C[c++] = A[i];
        }

        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
        System.out.println("C: " + Arrays.toString(C));
    }
}
