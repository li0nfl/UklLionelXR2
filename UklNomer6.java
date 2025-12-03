import java.util.Scanner;
public class UklNomer6 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.println("===Total biaya peminjaman buku di perpustakaan===");
        System.out.println("Total ini dihitung berdasarkan kategori buku dan lama peminjaman (hari)");
        System.out.println(" ");

        System.out.println("Masukkan Nama Peminjam: ");
        String nama = inputan.nextLine();

        System.out.println("Masukkan Judul Buku: ");
        String judul = inputan.nextLine();

        System.out.println("Masukkan Kategori Buku(a,b, atau c): ");
        String kategori = inputan.nextLine();

        System.out.println("Masukkan Lama Peminjaman(hari): ");
        int hari = inputan.nextInt();

        int tarifPerHari = 0;
        if (kategori.equals("a")) {
            tarifPerHari = 2000;
        } else if (kategori.equals("b")) {
            tarifPerHari = 1500;
        } else if (kategori.equals("c")) {
            tarifPerHari = 1000;
        } else {
            System.out.println("Kategori Tidak Valid!");
            return;
        }
        int biayaAwal = tarifPerHari*hari;

        int denda = 0;
        if (hari > 7) {
            int hariTerlambat = hari - 7;
            denda = hariTerlambat * 500;
        }
        int totalBiaya = biayaAwal+denda;

        System.out.println("===DETAIL PEMINJAMAN===");
        System.out.println("Nama Peminjam                 : "+nama);
        System.out.println("Judul Buku                    :"+judul);
        System.out.println("Kategori Buku                 :"+kategori);
        System.out.println("Laman Peminjaman              :"+hari);
        System.out.println("Biaya Peminjaman Awal         "+biayaAwal);
        System.out.println("Denda Keterlambatan(jika ada) "+denda);
        System.out.println("Total Biaya Akhir             "+totalBiaya);
        
    }
    
}
