package AOK;
import java.util.Scanner;

public class konversiBilangan {
   
    public static int binerKeDesimal(String biner) {
        int desimal = Integer.parseInt(biner, 2);
        return desimal;
    }

    public static String desimalKeBiner(int desimal) {
        String biner = Integer.toBinaryString(desimal);
        return biner;
    }

    public static String binerKeHexa(String biner) {
        int desimal = Integer.parseInt(biner, 2);
        String hexa = Integer.toHexString(desimal);
        return hexa;
    }

    public static String hexaKeBiner(String hexa) {
        int desimal = Integer.parseInt(hexa, 16);
        String biner = Integer.toBinaryString(desimal);
        return biner;
    }

    public static String desimalKeHexa(int desimal) {
        String hexa = Integer.toHexString(desimal);
        return hexa;
    }

    public static int hexaKeDesimal(String hexa) {
        int desimal = Integer.parseInt(hexa, 16);
        return desimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== KONVERSI BILANGAN =====");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Hexa");
            System.out.println("4. Hexa ke Biner");
            System.out.println("5. Desimal ke Hexa");
            System.out.println("6. Hexa ke Desimal");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    String biner = scanner.next();
                    int desimalBiner = binerKeDesimal(biner);
                    System.out.println("Hasil konversi biner ke desimal: " + desimalBiner);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal = scanner.nextInt();
                    String binerDesimal = desimalKeBiner(desimal);
                    System.out.println("Hasil konversi desimal ke biner: " + binerDesimal);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String binerHexa = scanner.next();
                    String hexaBiner = binerKeHexa(binerHexa);
                    System.out.println("Hasil konversi biner ke hexa: " + hexaBiner);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan hexa: ");
                    String hexaBinerInput = scanner.next();
                    String binerHexaOutput = hexaKeBiner(hexaBinerInput);
                    System.out.println("Hasil konversi hexa ke biner: " + binerHexaOutput);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimalHexa = scanner.nextInt();
                    String hexaDesimal = desimalKeHexa(desimalHexa);
                    System.out.println("Hasil konversi desimal ke hexa: " + hexaDesimal);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan hexa: ");
                    String hexaDesimalInput = scanner.next();
                    int desimalHexaOutput = hexaKeDesimal(hexaDesimalInput);
                    System.out.println("Hasil konversi hexa ke desimal: " + desimalHexaOutput);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

            System.out.println();
        } while (pilihan != 0);

        scanner.close();
    }
}
