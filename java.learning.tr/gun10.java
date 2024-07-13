import java.util.Scanner;

public class gun10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            System.out.print("Bölecek sayıyı girin: ");
            int bolen = scanner.nextInt();

            // Bölme işlemi
            double sonuc = sayi / bolen;
            System.out.println(sayi + " / " + bolen + " = " + sonuc);
        } catch (ArithmeticException e) {
            // Bölen sıfır olduğunda çalışacak blok
            System.err.println("Hata: Bölen sıfır olamaz! " + e.getMessage());
        } catch (Exception e) {
            // Diğer istisnalar için genel hata mesajı
            System.err.println("Hata oluştu: " + e.getMessage());
        } finally {
            // Scanner kapatma işlemi
            scanner.close();
        }
    }
}
