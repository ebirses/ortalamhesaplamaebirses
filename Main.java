import com.sun.source.tree.ReturnTree;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcı değerlerini al
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;

        System.out.println("Not Ortalamanız: " + sonuc);

        boolean kosul1 = sonuc >= 49;
        String gecermi = kosul1 ? "Geçtiniz" : "Kaldınız";
        System.out.println(gecermi);

    }
}
