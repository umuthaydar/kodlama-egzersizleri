import java.util.Scanner;

public class _50denBuyukSayilar {
    public static void main(String[] args) {
        // Girilen 10 sayıdan 50'den büyük olanlarını ekrana yazdıran program.

        Scanner scanner = new Scanner(System.in);

        int[] sayilar = new int[10];

        System.out.println("Lütfen 10 tane sayı giriniz: ");
        for (int i = 0 ; i<sayilar.length; i++ ){
            sayilar[i] = scanner.nextInt();
        }

        System.out.println("50'den büyük sayılar; ");

        for (int i : sayilar){
            if (i > 50){
                System.out.println(i);
            }
        }








    }
}
