public class gun5 {
    // multiply adında iki sayının çarpımını hesaplayan metot
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // İki sayının çarpımını hesaplamak için multiply metodunu çağır
        int num1 = 3;
        int num2 = 3;
        int result = multiply(num1, num2);
        
        // Sonucu ekrana yazdır
        System.out.println(num1 + " ve " + num2 + " sayılarının çarpımı: " + result);
    }
}
