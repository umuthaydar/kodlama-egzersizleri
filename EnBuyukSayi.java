import java.util.Scanner;

public class EnBuyukSayi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("Üçüncü Sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        if (sayi1 > sayi2 & sayi1 >sayi3  ){
            System.out.println("En büyük sayı: " + sayi1);
        }
        if (sayi2 > sayi1 & sayi2 >sayi3  ){
            System.out.println("En büyük sayı: " + sayi2);
        }
        if (sayi3 > sayi1 & sayi3 >sayi2  ){
            System.out.println("En büyük sayı: " + sayi3);
        }
    
    }
}
