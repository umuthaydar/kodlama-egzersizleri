import java.util.Scanner;

public class AsalSayiMi {
    public static void main(String[] args) {
        // Girilen sayının asal olup olmadığını kontrol eden kod.
        // Asal sayılar: Sadece kendisine ve 1'e bölünebilen 1'den büyük doğal sayılardır.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        int sayac = 0;

        if (sayi <= 1){
            System.out.println("1'den büyük sayılar asal sayı olabilir!");
        }

        else{
            for (int i = 2; i < sayi;i++){
                if (sayi % i == 0){
                    sayac++;
                }
            }

            if (sayac == 0){
                System.out.println(sayi + " Asal Sayıdır.");
            }

            else {
                System.out.println(sayi + " Asal Sayı değildir!");
            }
        }

    }
}
