import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        boolean isTrue = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Notlarınızı 0 veya 100 olarak girin ! Diğer değerler hesaplanamaz !");

        System.out.print("Matematik notunuzu girin:");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
        } else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir !");
            mat = 0;
        }

        System.out.print("Fizik notunuzu girin:");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
        } else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir !");
            fizik = 0;
        }

        System.out.print("Türkçe notunuzu girin:");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
        } else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir !");
            turkce = 0;
        }

        System.out.print("Kimya notunuzu girin:");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
        } else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir !");
            kimya = 0;
        }

        System.out.print("Müzik notunuzu girin:");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
        } else {
            System.out.println("Notunuz 0 ile 100 arasında bir değer değildir !");
            muzik = 0;
        }

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız.Seneye tekrar  görüşmek üzere !");
        } else {
            System.out.println("Tebrikler.Sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız:" + avarage );
        avarage = input.nextInt();
        if (avarage >= 0 && avarage <= 100) {
        } else {
            System.out.println("Notunuz 0 ile 100 arasında değildir.Hesaplama yapılamadı !");
        }
    }
}