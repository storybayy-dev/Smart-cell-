import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class LayananController {
    
    // Fungsi Java untuk membuat link WhatsApp otomatis
    public String buatLinkWhatsApp(String namaLayanan) {
        String nomorAdmin = "6285879200256";
        String pesan = "Halo Smart Cell, saya ingin memesan layanan " + namaLayanan + ". Mohon info prosesnya.";
        
        // Java membutuhkan try-catch untuk encode teks URL
        try {
            String pesanTerencode = URLEncoder.encode(pesan, StandardCharsets.UTF_8.toString());
            return "https://wa.me" + nomorAdmin + "?text=" + pesanTerencode;
        } catch (Exception e) {
            return "https://wa.me" + nomorAdmin;
        }
    }
}
