public class gun4 {
    public static void main(String[] args) {
        // Bir tam sayı dizisi oluştur
        int[] sayilar = {34, 7, 23, 32, 5, 62};

        // En büyük ve en küçük sayıları bulmak için değişkenler oluştur
        int enBuyuk = sayilar[0];
        int enKucuk = sayilar[0];

        // Dizinin elemanlarını kontrol etmek için for döngüsü kullan
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
            }
            if (sayilar[i] < enKucuk) {
                enKucuk = sayilar[i];
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("Dizideki en büyük sayı: " + enBuyuk);
        System.out.println("Dizideki en küçük sayı: " + enKucuk);
    }
}
