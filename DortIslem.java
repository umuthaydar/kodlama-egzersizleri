import java.util.Scanner;

public class DortIslem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Toplama İşlemi
        System.out.println("İlk önce toplama işlemi yapalım!");
        System.out.println("Birinci sayıyı giriniz: ");
        int t1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int t2 = scanner.nextInt();

        int toplam = t1 + t2;
        System.out.println("Sayıların Toplamı: " + toplam);

        System.out.println("------------------------------------");

        // Çıkarma İşlemi
        System.out.println("İkinci olarak çıkarma işlemi yapalım!");
        System.out.println("Birinci sayıyı giriniz: ");
        int f1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int f2 = scanner.nextInt();

        int fark = f1 - f2;
        System.out.println("Sayıların Farkı: " + fark);

        System.out.println("------------------------------------");

        // Çarpma İşlemi
        System.out.println("Şimdide çarpma işlemi yapalım!");
        System.out.println("Birinci sayıyı giriniz: ");
        int c1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int c2 = scanner.nextInt();

        int carpım = c1 * c2;
        System.out.println("Sayıların Çarpımı: " + carpım);

        System.out.println("------------------------------------");

        //Bölme İşlemi
        System.out.println("Son olarak bölme işlemi yapalım!");
        System.out.println("Birinci sayıyı giriniz: ");
        int b1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b2 = scanner.nextInt();

        int bolum = b1 / b2;
        System.out.println("Sayıların Bölümü: " + bolum);
    }
}
