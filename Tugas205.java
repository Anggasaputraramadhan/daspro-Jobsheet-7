import java.util.Scanner;

public class Tugas205 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int jenis, durasi, total = 0;

        
        while (true) {    
                System.out.println("Jenis Kendaraan");
                System.out.println("1. Mobil");
                System.out.println("2. Motor");
                System.out.println("0. Keluar");
                System.out.print("Masukkan jenis kendaraan: ");
                jenis = sc05.nextInt();
                if (jenis == 0) {
                    break;
                } else if (jenis == 1 || jenis == 2) {
                    System.out.print("Masukkan lama durasi: ");
                    durasi = sc05.nextInt();
                    if (durasi > 5) {
                        total += 12500;        
                    } else {
                        if (jenis == 1) {
                            total += durasi*3000;
                        } else if (jenis == 2) {
                                total += durasi*2000;
                        }
                    }
                    System.out.println("Total yang harus dibayar: Rp " + total);
                } else {
                    System.out.println("Input tidak valid");
                }
            }
    }
}