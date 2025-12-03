import java.util.Scanner;

public class UklNomer2 {
        public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("--Menentukan Uang Pecahan Yang Dibutuhkan--");
        System.out.println("Masukkan Uang Yang Ingin Ditentukan: ");
        int uang = inputan.nextInt();
        
        int[]pecahan = {100000,50000,20000,10000,5000,2000,1000,500,200,100,20,10};
        
        for(int p : pecahan){
            int lembar = uang/p;
            if (lembar > 0){
                if (p > 500) {
                System.out.println(lembar+" Lembar "+p);
                } else if (p > 100) {
                    System.out.println(lembar+" Koin "+p);
                } else {
                    System.out.println(lembar+ " Peni "+p );
                }
                
            }
            uang %= p;
        }
    }
}

