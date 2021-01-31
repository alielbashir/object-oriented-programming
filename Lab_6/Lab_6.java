import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class RastgeleDizi {
    int[] tamsayilar;

    RastgeleDizi(int n) {
        tamsayilar = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            tamsayilar[i] = random.nextInt(99) + 1;
        }
    }

    int sum() {
        int total = 0;
        for (int j : tamsayilar) {
            total += j;
        }
        return total;
    }

    void printArray() {
        System.out.println("tamsayilar:");
        System.out.println(Arrays.toString(tamsayilar));
        System.out.println("sum = " + sum());
    }
}

public class Lab_6 {
    public static void main(String[] args) {
        System.out.println("--------------CALISMA 1--------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("satir sayisini giriniz: ");
        int y = scanner.nextInt();
        System.out.print("sutun sayisini giriniz: ");
        int x = scanner.nextInt();
        int[][] array = createArray(y, x);
        for (int i = 0; i < y; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("--------------CALISMA 2--------------");
        System.out.print("eleman sayisini giriniz: ");
        int n = scanner.nextInt();
        RastgeleDizi rastgeleDizi = new RastgeleDizi(n);
        rastgeleDizi.printArray();

    }

    public static int[][] createArray(int y, int x) {
        Random random = new Random();
        int[][] array = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                array[i][j] = random.nextInt(99) + 1;
            }
        }
        return array;
    }
}
