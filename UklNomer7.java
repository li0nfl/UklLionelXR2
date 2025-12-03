import java.util.Scanner;
import java.util.ArrayList;

class Cookies{
    String nama;
    int hargaProduksi;
    int hargaJual;
    int jumlahTerjual;

    public Cookies (String nama, int hargaProduksi, int hargaJual,int jumlahTerjual){
        this.nama = nama;
        this.hargaProduksi = hargaProduksi;
        this.hargaJual = hargaJual;
        this.jumlahTerjual = jumlahTerjual;
    }

    public int getTotalBiaya(){
        return hargaProduksi*jumlahTerjual;
    }
    public int getTotalPendapatan(){
        return hargaJual*jumlahTerjual;
    }
    public int getTotalLaba(){
        return getTotalPendapatan()-getTotalBiaya();
    }
    public String getStatus(){
        if (getTotalLaba() > 0) return "Laba";
        else if (getTotalLaba() < 0) return "Rugi";
        else return "Impas";
        }    
        }

public class UklNomer7 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        ArrayList <Cookies> daftar = new ArrayList<>();
        
        System.out.println("Masukkan Jumlah Jenis Cookies: ");
        int jumlah = inputan.nextInt();
        inputan.nextLine();

        for (int i = 0; i < jumlah; i++){
            System.out.println("Cookies ke- "+(i+1));

            System.out.println("Nama Cookies: ");
            String nama = inputan.nextLine();

            System.out.println( "Harga produksi per bungkus: ");
            int hargaPro = inputan.nextInt();

            System.out.println("Harga jual per bungkus: ");
            int hargaBungkus = inputan.nextInt();

            System.out.println("Jumlah terjual: ");
            int jumTerjual = inputan.nextInt();
            inputan.nextLine();

            daftar.add(new Cookies(nama, hargaPro, hargaPro, jumTerjual));
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nama Cookies | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("-----------------------------------------------------------");

        int totalSemuaLaba = 0;
        int labaTertingi = Integer.MIN_VALUE;
        String cookiesTertinggi = "";
         for (Cookies c : daftar){
            int biaya = c.getTotalBiaya();
            int pendapatan = c.getTotalPendapatan();
            int laba = c.getTotalLaba();
            String status = c.getStatus();

            System.out.printf("%-15s | Rp%,10d | Rp%,14d | Rp%,8d | %s\n",
                c.nama, biaya, pendapatan, laba, status);

            totalSemuaLaba += laba;
            if (laba > labaTertingi) {
                labaTertingi = laba;
                cookiesTertinggi = c.nama;
            }
         }
         System.out.println("-----------------------------------------------------------");
         System.out.printf("Total Laba/Rugi Keseluruhan: Rp%,d\n", totalSemuaLaba);
         System.out.printf("Cookies dengan Laba Tertinggi: %s (Rp%,d)\n",
                cookiesTertinggi, labaTertingi);
    }
}
