import java.util.Scanner;
import Models.*;
import Service.* ;
import Thread.* ;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        // treadler oluşturuldu
        ReadingThread readThread= new ReadingThread();
        WritingThread writingThread = new WritingThread() ;
        // ilgili işlemler seçilir
        while(true){
            System.out.println("Yapmak istediğiniz işlemi giriniz .");
            System.out.println("** 'read','write','both','quit' ** ");

            String text = scanner.nextLine() ;
            if(text.equals("read")){
                readThread.run();
            }else if(text.equals("write")){
                writingThread.run();
            } else if (text.equals("both")) {
                readThread.run();
                writingThread.run();
            }else if(text.equals("quit")){
                System.out.println("Çıkış yapıldı.");
                break ;
            }
            else {
                System.out.println("Geçersiz değer .");
            }
            System.out.println("* * * * * ");

        }
    }
}