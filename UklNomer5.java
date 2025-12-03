import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UklNomer5 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Integer> riwayatKomputer = new ArrayList<>();
        ArrayList<Integer> riwayatPemain = new ArrayList<>();

        int menangKomputer = 0;
        int menangPemain = 0;

        System.out.println("---PERMAINAN LEMPAR DADU---");
        System.out.println("!!Siapa yang mencapai 5 kemenangan duluan akan menang!!");

        while (menangKomputer < 5 && menangPemain < 5) {
            System.out.print("Tekan tombol acak untuk memulai permainan: ");
            inputan.nextInt();
            System.out.println(" ");

            int daduKomputer = rand.nextInt(6)+1;
            int daduPemain = rand.nextInt(6)+1;

            riwayatKomputer.add(daduKomputer);
            riwayatPemain.add(daduPemain);

            System.out.println("---RONDE DIMULAI---");
            System.out.println("Nilai dadu komputer: "+daduKomputer);
            System.out.println("Nilai dadu Kamu: "+daduPemain);
            System.out.println(" ");

            if (daduPemain > daduKomputer) {
                System.out.println("🏆Pemain menang di ronde ini!🏆");
                menangPemain++;
            } else if (daduPemain < daduKomputer){
                System.out.println("🤖Komputer menang di ronde ini!🤖");
                menangKomputer++;
            } else {
                System.out.println("⚖️!Ronde kali ini Seri!⚖️");
                System.out.println(" ");
            }
            
        }
        System.out.println("---PERMAINAN SELESAI---");
        if (menangPemain == 5) {
            System.out.println("🏆PERMAINAN DIMENANGKAN OLEH PEMAIN🏆");
        } else {
            System.out.println("🏆PERMAINAN DIMENANGKAN OLEH KOMPUTER🤖");
            System.out.println(" ");
        }
        System.out.println("===REKAP RIWAYAT===");
        System.out.println("Riwayat Lemparan Pemain: "+riwayatPemain);
        System.out.println("Riwayat Lemparan Komputer: "+riwayatKomputer);
        System.out.println(" ");

        System.out.println("---TOTAL KEMENANGAN---");
        System.out.println("Pemain  : "+menangPemain);
        System.out.println("Komputer: "+menangKomputer);

    }
}
