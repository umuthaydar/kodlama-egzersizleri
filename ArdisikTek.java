import java.util.Scanner;

public class ArdisikTek {
    public static void main(String[] args) {
        // Ardışık Tek Sayıların toplamını bulma

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        if (sayi % 2 == 0){
            System.out.println("Lütfen Tek Sayı Giriniz!");
        }
        else{
            for (int i=1; i <=sayi; i++){
                if (i % 2 != 0){
                    toplam += i;
                }

            }
            System.out.println("Ardışık Tek Sayıların Toplamı: " + toplam);
        }
    }
}
