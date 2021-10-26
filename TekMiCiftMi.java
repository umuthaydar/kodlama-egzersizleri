import java.util.Scanner;

public class TekMiCiftMi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Girilen sayının Tek mi Çift mi olduğunu bulalım!");
        System.out.println("---------------------------------");

        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0){
            System.out.println(sayi + " sayısı ÇİFT sayıdır!");
        }
        else {
            System.out.println(sayi + " sayısı TEK sayıdır!");
        }

    }
}
