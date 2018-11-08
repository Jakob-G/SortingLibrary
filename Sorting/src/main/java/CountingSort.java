import java.util.ArrayList;
import java.util.List;

public class CountingSort {

    public List list = new ArrayList<Integer>();

    public List sort(List list){

        int length = list.size();
        List newList = new ArrayList<Integer>();

        for(int x=0;x<length;x++){
            if (newList.size()<(Integer)list.get(x)+1){
                for(int n=newList.size();n<(Integer)list.get(x)+1;n++){
                    newList.add(0);
                }
            }
            newList.set((Integer)list.get(x),(Integer)newList.get((Integer)list.get(x))+1);
        }
        int counter = 0;
        for(int i = 1;i<newList.size();i++){
            for(int x = 0;x<(Integer)newList.get(i);x++){
                list.set(counter,i);
                counter++;
            }
        }
        return list;
    }
}

