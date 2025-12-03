import java.util.Scanner;
import java.util.ArrayList;

public class UklNomer4 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah elemen array: ");
        int n = inputan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Masukkan elemen ke-"+(i+1)+": ");
            array[i] = inputan.nextInt();
        }

         ArrayList<Integer> duplikatList = new ArrayList<>();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j] && i != j && !duplikatList.contains(array[i])) {                    
                    duplikatList.add(array[i]);
                    break;
                }
            }
        }
        if (duplikatList.size() > 0) {
            System.out.print("Array memiliki elemen duplikat: ");
            for (int d : duplikatList){
                System.out.print (d+" ");
            }
            System.out.println();
        } else {
            System.out.println("Tidak ada elemen duplikat");
        }
    }
}
