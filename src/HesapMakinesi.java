import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz : ");
        double birinciSayi = scan.nextDouble();

        System.out.println("2.sayıyı giriniz : ");
        double ikinciSayi = scan.nextDouble();

        System.out.println("1-)Toplama/n2-)Çıkarma/n3-)Çarpma/n4-)Bölme ");
        byte islem = scan.nextByte();

        switch (islem) {
            case 1:
                System.out.println("Toplam : " + (birinciSayi + ikinciSayi));
                break;
            case 2:
                System.out.println("Fark : " + (birinciSayi - ikinciSayi));
                break;
            case 3:
                System.out.println("Çarpma : " + (birinciSayi * ikinciSayi));
                break;
            case 4:
                System.out.println("Bölme : " + (birinciSayi / ikinciSayi));
                break;
        }

    }}
