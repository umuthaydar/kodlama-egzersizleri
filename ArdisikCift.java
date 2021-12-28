import java.util.Scanner;

public class ArdisikCift {
    public static void main(String[] args) {
        // Girilen sayıya kadar olan ardışık çift sayiların toplamını bulan kod

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        // Ardışık çift sayıların toplamı 2+4+6+8+......+2n = n.(n+1) formülü ile hesaplanır.

//        if (sayi % 2 == 0){
//            int sonuc = ((sayi/2) * (sayi/2 +1));
//            System.out.println("Ardışık Çift Sayıların Toplamı: " + sonuc);
//        }
//        else {
//            System.out.println("Lütfen Çift Sayı Giriniz!");
//        }
        if (sayi % 2 == 0){

            int toplam = 0;
            for (int i=1; i<=sayi; i++){
                if (i % 2 == 0){
                    toplam += i;
                }
            }
            System.out.println("Ardışık Çift Sayıların Toplamı: " + toplam);
        }
        else {
            System.out.println("Lütfen Çift Sayı Giriniz!");
        }
    }
}
