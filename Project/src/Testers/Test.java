package Testers;
import Sorters.*;
public class Test {

    public static void main(String args[]){
        try {
            System.out.println("A".compareTo("b"));
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
