import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        System.out.println("----------------Calisma 1----------------");

        long faktoriyel, toplam;
        Scanner scanner = new Scanner(System.in);
        faktoriyel = 1;
        for (int i = 1; i < 11; i++) {
            toplam = faktoriyel * i;
            faktoriyel = toplam;
        }
        System.out.println("10! esittir: " + faktoriyel);

        System.out.println("----------------Calisma 2----------------");
        String birinci, ikinci, ucuncu;
        
        System.out.println("1. kelimeyi giriniz");
        birinci = scanner.nextLine();
        System.out.println("2. kelimeyi giriniz");
        ikinci = scanner.nextLine();
        System.out.println("3. kelimeyi giriniz");
        ucuncu = scanner.nextLine();
        System.out.println("cevap: ");
        System.out.println(birinci + "//" + ikinci + "//" + ucuncu);
        scanner.close();
    }
}