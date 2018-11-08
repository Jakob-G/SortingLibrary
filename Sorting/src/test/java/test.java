import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String args[]){
        try (Stream<String> stream = Files.lines(Paths.get("src\\test\\resources\\numbers.txt"))) {
            List<Integer> list = new ArrayList<>();
            stream.forEach(x -> list.add(Integer.parseInt(x)));
            CountingSort CountingSort = new CountingSort();
            System.out.println(list);
            System.out.println(CountingSort.sort(list));


    } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
