import java.util.Random;
import java.util.Scanner;

public class UklNomer3 {
        public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        Random rand = new Random();

            System.out.println(" Pilih operator (*,/,%): ");
            String p = inputan.nextLine();

         while (true) {
            int a = rand.nextInt(10) + 1;
            int b = rand.nextInt(10) + 1;
            int hasil = 0;


            if (p.equals("*")){
                hasil = a*b;
            } else if (p.equals("/")) {
                hasil = a/b;
            } else if (p.equals("%")) {
                hasil = a%b;
            } else {
                System.out.println("Operator tidak valid!");
                break;
            }

            System.out.print(a + " " + p + " " + b + " = ");
            int jawaban = inputan.nextInt();

            System.out.println("Hasil yang benar adalah: "+hasil);

            System.out.print("Lanjut? (y/n): ");
            if (inputan.next().equalsIgnoreCase("n")) {
                break;
            }

            System.out.println();
        }

        System.out.println("Terima kasih!");
    }
}

