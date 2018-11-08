import java.util.ArrayList;

import java.util.List;


public class QuickSort {

    public List list = new ArrayList<Integer>();

    public void test(){
        sort(list,0,list.size()-1);
    }

    int partition(List list, int low, int high)
    {
        int pivot = (Integer)list.get(high); //num at pivot
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if ((Integer)list.get(j) <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = (Integer)list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = (Integer)list.get(i+1);
        list.set(i+1,list.get(high));
        list.set(high,temp);

        return i+1;
    }


    private void sort(List list, int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(list, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(list, low, pi-1);
            sort(list, pi+1, high);
        }
    }
}

