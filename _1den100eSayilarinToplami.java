public class _1den100eSayilarinToplami {
    public static void main(String[] args) {
        // 1'den 100'e kadar sayıların toplamını ekrana yazdıralım.

        int sayi = 100;
        int toplam = 0;

        for (int i = 0; i <= sayi; i++){
            toplam += i;
        }
        System.out.println(" 1'den 100'e kadar olan sayıların toplamı: " + toplam);
    }
}
