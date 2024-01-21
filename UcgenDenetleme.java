import java.util.Scanner;

public class UcgenDenetleme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. kenarı giriniz: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("2. kenarı giriniz: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("3. kenarı giriniz: ");
        double kenar3 = scanner.nextDouble();

        if (ucgenMi(kenar1, kenar2, kenar3)) {
            System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulabilir.");

            if (eskenarMi(kenar1, kenar2, kenar3)) {
                System.out.println("Bu üçgen eşkenar bir üçgendir.");
            } else if (ikizkenarMi(kenar1, kenar2, kenar3)) {
                System.out.println("Bu üçgen ikizkenar bir üçgendir.");
            } else if (dikKenarMi(kenar1, kenar2, kenar3)) {
                System.out.println("Bu üçgen dik kenar bir üçgendir.");
            } else {
                System.out.println("Bu üçgen herhangi özel bir türe ait değildir.");
            }

        } else {
            System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulamaz.");
        }
    }

    private static boolean ucgenMi(double a, double b, double c) {
        // Üç kenarın uzunlukları ile üçgenin varlığını kontrol etme
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private static boolean eskenarMi(double a, double b, double c) {
        // Eşkenar üçgen kontrolü
        return (a == b) && (b == c);
    }

    private static boolean ikizkenarMi(double a, double b, double c) {
        // İkizkenar üçgen kontrolü
        return (a == b) || (a == c) || (b == c);
    }

    private static boolean dikKenarMi(double a, double b, double c) {
        // Dik kenar üçgen kontrolü
        double aKare = Math.pow(a, 2);
        double bKare = Math.pow(b, 2);
        double cKare = Math.pow(c, 2);

        return (aKare + bKare == cKare) || (aKare + cKare == bKare) || (bKare + cKare == aKare);
    }
}
