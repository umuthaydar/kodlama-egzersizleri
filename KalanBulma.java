import java.util.Scanner;

public class KalanBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a'nın b'ye bölümünden kalanı bulma!");

        System.out.println("Lütfen ilk sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int b = scanner.nextInt();

        int kalan = a % b ;

        System.out.println(a + " sayısının " + b + " sayısına bölümünden kalan: " + kalan);

    }
}
