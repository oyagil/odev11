package org.example;
import java.util.Date;

public class Logger {
    // Tek örnek (singleton) alanı
    private static Logger instance;

    // Özel kurucu metod, dış erişime kapalı
    private Logger() {
        // Kurucu metod boş bırakıldı, gerekirse buraya ek işlemler eklenebilir
    }

    // Singleton örneğini döndüren method
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log kaydı yapacak method
    public void log(String message) {
        Date now = new Date();
        System.out.println(now.toString() + ": " + message);
    }
}

