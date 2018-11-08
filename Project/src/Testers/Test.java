package Testers;
import Sorters.*;
import java.util.Scanner;
public class Test {

    public static void main(String args[]){
        try {
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("What sort do you want to use: ");
            System.out.println("1. Counting Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Merge Sort");
            int n = reader.nextInt();

            System.out.println("What sort do you want to use: ");
            System.out.println("1: Numbers");
            System.out.println("2: Strings");
            int x = reader.nextInt();
            if(n == 1) {
                CountingSort CountingSort = new CountingSort();
                CountingSort.load();
                System.out.println(CountingSort.list);
                CountingSort.test();
                System.out.println(CountingSort.list);
            }else if(n==2){
                QuickSort QuickSort = new QuickSort();
                QuickSort.load();
                System.out.println(QuickSort.list);
                QuickSort.test();
                System.out.println(QuickSort.list);
            }
            else if(n==3)
            {
                MergeSort MergeSort = new MergeSort();
                MergeSort.load();
                System.out.println(MergeSort.list);
                MergeSort.test();
                System.out.println(MergeSort.list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
