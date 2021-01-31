import java.util.Scanner;

public class Lab_3 {
    public static void main(String[] args) {
        // Setup
        String[] cumleler = new String[2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("birinci cumleyi giriniz: ");
        cumleler[0] = scanner.nextLine();
        System.out.print("ikinci cumleyi giriniz: ");
        cumleler[1] = scanner.nextLine();
        // Function calls
        calisma1(cumleler);
        calisma2(cumleler[0]);
    }

    private static void calisma1(String[] cumleler) {
        System.out.println("----------------Calisma 1----------------");

        // Length check
        if (cumleler[0].length() != cumleler[1].length()) {
            System.out.println("iki cumle farklidir");
            return;
        }
        // Character check
        for (int i = 0; i < cumleler[0].length(); i++)
            if (cumleler[0].charAt(i) != cumleler[1].charAt(i)) {
                System.out.println("iki cumle farklidir");
                return;
            }
        System.out.println("iki cumle esittir");
    }

    private static void calisma2(String cumle) {
        System.out.println("----------------Calisma 2----------------");

        char[] cumleArray = cumle.toCharArray();
        System.out.print("birinci cumlenin tersi: ");
        for (int i = cumleArray.length - 1; i >= 0; i--) {
            System.out.print(cumleArray[i]);
        }
        System.out.println();
    }
}
