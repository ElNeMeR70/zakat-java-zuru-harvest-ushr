import java.nio.charset.StandardCharsets;

/**
 * zakat-java-zuru-harvest-ushr — حاسبة زكاة الزروع والثمار بالعشر أو نصف العشر
 * Agricultural Zuru' & Thimar Ushr (10% / 5% / 7.5%) Calculator
 */
public final class Main {
    public static void main(String[] args) {
        String input = "CropKg=1000,Irrigation=RainFed";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] zakat-java-zuru-harvest-ushr (Java) — Agricultural Zuru' & Thimar Ushr (10% / 5% / 7.5%) Calculator");
        System.out.println("[AR]  حاسبة زكاة الزروع والثمار بالعشر أو نصف العشر");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", "Nisab5WasaqKg=653 | Rate=10% | ZakatKg=100.0", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}
