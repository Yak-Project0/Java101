import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        int tutar = scanner.nextInt();
        double KDV = tutar>=0 && tutar<=1000 ? 0.18 : 0.08;
        double kdvliTutar = tutar + tutar*KDV;
        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV oranı: "+KDV);
        System.out.println("KDV Tutarı: "+tutar*KDV);
        System.out.println("KDV'li Tutar: "+kdvliTutar);
    }
}