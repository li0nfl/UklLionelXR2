import java.util.ArrayList;
import java.util.Scanner;

public class UklNomer7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> namaCookies = new ArrayList<>();
        ArrayList<Integer> hargaProduksi = new ArrayList<>();
        ArrayList<Integer> hargaJual = new ArrayList<>();
        ArrayList<Integer> jumlahTerjual = new ArrayList<>();

        ArrayList<Integer> totalBiaya = new ArrayList<>();
        ArrayList<Integer> totalPendapatan = new ArrayList<>();
        ArrayList<Integer> labaRugi = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();

        System.out.print("Masukkan jumlah jenis cookies: ");
        int jumlah = input.nextInt();
        input.nextLine(); 
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nCookies ke-" + (i + 1) + ":");

            System.out.print("Nama cookies: ");
            namaCookies.add(input.nextLine());

            System.out.print("Harga produksi per bungkus: ");
            hargaProduksi.add(input.nextInt());

            System.out.print("Harga jual per bungkus: ");
            hargaJual.add(input.nextInt());

            System.out.print("Jumlah terjual: ");
            jumlahTerjual.add(input.nextInt());
            input.nextLine(); 

            int biaya = hargaProduksi.get(i) * jumlahTerjual.get(i);
            int pendapatan = hargaJual.get(i) * jumlahTerjual.get(i);
            int laba = pendapatan - biaya;

            totalBiaya.add(biaya);
            totalPendapatan.add(pendapatan);
            labaRugi.add(laba);

            if (laba > 0) status.add("Laba");
            else if (laba < 0) status.add("Rugi");
            else status.add("Impas");
        }

        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Nama Cookies      | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("-----------------------------------------------------------");

        int totalKeseluruhan = 0;
        int labaTertinggi = Integer.MIN_VALUE;
        String cookiesTerbaik = "";

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-17s | Rp%-10d | Rp%-14d | Rp%-8d | %s\n",
                namaCookies.get(i),
                totalBiaya.get(i),
                totalPendapatan.get(i),
                labaRugi.get(i),
                status.get(i)
            );

            totalKeseluruhan += labaRugi.get(i);

            if (labaRugi.get(i) > labaTertinggi) {
                labaTertinggi = labaRugi.get(i);
                cookiesTerbaik = namaCookies.get(i);
            }
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + totalKeseluruhan);
        System.out.println("Cookies dengan Laba Tertinggi: " + cookiesTerbaik + " (Rp" + labaTertinggi + ")");
    }
}
