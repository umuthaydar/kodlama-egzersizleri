import java.util.Scanner;

public class FaktoriyelHesaplama {

    public static void faktoriyel(int sayi){
        int faktoriyel = 1;
        for (int i=1; i<=sayi;i++){
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + " Sayısının faktoriyeli " + faktoriyel);
    }

    public static void main(String[] args) {

        faktoriyel(5);
    }
}
