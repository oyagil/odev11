package org.example;

public class Main {
    public static void main(String[] args) {
        // Singleton logger örneği alma
        Logger logger = Logger.getInstance();

        // Log kaydı yapma
        logger.log("Uygulama başlatıldı.");
        logger.log("Kullanıcı girişi yapıldı.");
        logger.log("Veritabanı bağlantısı kuruldu.");
    }
}
