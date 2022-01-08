import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab_5 {
    public static void main(String[] args) {
        System.out.println("--------------CALISMA 1--------------");
        ArrayList<Float> sayilar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Lütfen bir sayı giriniz. Eğer çıkmak istiyorsanız 0’a basınız");
            sayilar.add(0, scanner.nextFloat());
        } while (sayilar.get(0) != 0);
        sayilar.remove(0);
        float sum = 0;
        for (Float sayi : sayilar) {
            sum += sayi;
        }
        System.out.println("ortalama = " + (sum / sayilar.size()));

        System.out.println("--------------CALISMA 2--------------");
        int lenA = 5;
        int[] A = new int[lenA];
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();

        System.out.print(lenA + " sayiyi giriniz:\n");
        for (int i = 0; i < lenA; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < lenA; i++) {
            if (i % 2 != 0)
                B.add(A[i]);
            else
                C.add(A[i]);
        }
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + B);
        System.out.println("C: " + C);
    }
}
