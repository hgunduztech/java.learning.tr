public class gun3 {
    public static void main(String[] args) {
        // Toplam değişkenini oluştur ve 0 olarak başlat
        int toplam = 0;

        // for döngüsü kullanarak 1'den 10'a kadar sayıları döndür
        for (int i = 1; i <= 50; i++) {
            toplam += i; // Her adımda toplam değişkenine i değerini ekle
        }

        // Sonucu ekrana yazdır
        System.out.println("1'den 50'a kadar olan sayıların toplamı: " + toplam);
    }
}
