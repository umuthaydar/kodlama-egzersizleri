import java.time.LocalDateTime;
import java.util.Scanner;

public class YasHesaplama {
    public static void main(String[] args) {
        // Kullanıcı doğum yılını girerek yaşını hesaplayacağı bir kod yazalım!

        Scanner scanner = new Scanner(System.in);

        // LocaleDateTime Objesi oluşturuyoruz.
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Lütfen Doğum Yılınızı Giriniz: ");
        int dogum_yili = scanner.nextInt();

        // LocalDateTime'ın getYear() fonksiyonu ile şuanda bulunduğumuz yılı alıyoruz.
        int bulundugumuz_yil = now.getYear();

        int yas = (bulundugumuz_yil - dogum_yili);

        System.out.println("Yaşınız: " + yas);
    }
}
