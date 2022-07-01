package Thread;
import java.io.IOException;
import java.util.ArrayList;

import Models.Student;
import Service.*;


public class WritingThread implements Runnable{
    static JsonService jsonService; // jsonservisten students listesine erişilecek .
    static {
        try {
            jsonService = new JsonService();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void run() {
        try {
            //okuma yapıldı ise işlemler başlasın
            if (ThreadQueue.isRead == true) {
                System.out.println("Yazma işlemi başladı : :");
                System.out.println("* * * * *");
                //okumada listeye aktarılan Student bilgileri yazılsın .
                for(Student student : jsonService.students){
                    System.out.println("Öğrenci isim   :" + student.getName());
                    System.out.println("Öğrenci soyisim : " + student.getSurname());
                    System.out.println("Öğrenci yaş : "+ student.getAge());
                    System.out.println("* * * * *");
                    Thread.sleep(3000);
                }
                System.out.println("Yazma işlemi tamamlandı . ");
            }else{
                System.out.println("Okuma işlemi yapılmadan yazma yapılamaz.");
            }
        } catch (InterruptedException e) {
            System.out.println("Hata mesajı " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
