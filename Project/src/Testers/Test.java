package Testers;
import Sorters.CountingSort;
public class Test {

    public static void main(String args[]){
        try {
            CountingSort CountingSort = new CountingSort();
            CountingSort.load();
            System.out.println(CountingSort.list);
            CountingSort.test();
            System.out.println(CountingSort.list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
