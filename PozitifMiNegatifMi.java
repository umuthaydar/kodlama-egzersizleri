import java.util.Scanner;

public class PozitifMiNegatifMi {
    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        System.out.println("Girilen sayının Negatif mi Pozitif mi olduğunu bulalım!");
        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 0){
            System.out.println(sayi + " sayısı NEGATİF sayıdır! ");
        }
        else {
            System.out.println(sayi + " sayısı POZİTİF sayıdır! ");
        }



    }
}
