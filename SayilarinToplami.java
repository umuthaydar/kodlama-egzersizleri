import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
        // Kullanıcının girdiği sayıya kadar olan sayıların toplamını bulan kod

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        // 1'den n'e kadar olan sayıların toplamı (n * (n+1))/2 formülü ile bulunur.
//        int t = (sayi * (sayi + 1))/2;
//        System.out.println("Sonuç: " + t);

        // Bir başka yol da döngüleri kullanarak toplamaktır.
        int toplam = 0;
        for (int i=1; i <= sayi; i++){
            toplam += i;
        }
        System.out.println("Sonuç: " + toplam);

    }
}
