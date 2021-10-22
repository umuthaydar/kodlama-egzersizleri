import java.util.Scanner;

public class İkiSayininYeriniDegistirme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girilen iki sayının yerini değiştirme!");

        System.out.println("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.println("---Değişimden Önceki Düzen---");
        System.out.println("sayı 1: " + sayi1);
        System.out.println("sayı 2: " + sayi2);

        int gecici_sayi = sayi1;

        sayi1 = sayi2;

        sayi2 = gecici_sayi;

        System.out.println("---Değişimden Sonraki Düzen---");
        System.out.println("sayı 1: " + sayi1);
        System.out.println("sayı 2: " + sayi2);

    }
}
