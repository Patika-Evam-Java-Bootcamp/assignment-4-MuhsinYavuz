package Thread;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Service.*;

public class ReadingThread implements Runnable{
    public ReadingThread(){
    }
    @Override
    public void run() {
        try {
            System.out.println("Json Dosyası okunuyor ");
            JsonService jsonService = new JsonService(); // json ile okuma işlemi yapılarak veriler students listesine aktarılacak
            System.out.println("Okuma işlemi tamamlandı . ");
            ThreadQueue.isRead = true ;   // okuma işlemi tamamlandı şimdi yazmaya geçebilir .
        } catch (IOException e) {
            System.out.println("Hata mesajı" + e.getLocalizedMessage());
            throw new RuntimeException(e);
        }
    }

}
