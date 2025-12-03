import java.util.Scanner;
public class UklNomer1 {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);8
        
        System.out.println("Menentukan Bilangan Prima Atau Bukan");
        System.out.println("Masukkan Sebuah Bilangan: ");
        int n = inputan.nextInt();
        boolean Prima = true;
        
        if (n < 2 ){
            Prima = false;
        } else { 
            for(int i = 2; i<= Math.sqrt(n);i++){
                if(n % i == 0){
                    Prima = false;
                } 
            }
        }
        
        String[]namaAngka = {"Nol","Satu","Dua","Tiga","Empat","Lima","Enam",
        "Tujuh","Delapan","Sembilan"};

        String outputN; 
        if(n < 10 && n >= 0 ){
            outputN = namaAngka[n];
        } else {
            outputN = String.valueOf(n);
        }

        if(Prima){
            System.out.println(outputN+" Adalah Bilangan Prima");
        } else{
            System.out.println(outputN+" Bukan Bilangan Prima");
        }
    }
}



