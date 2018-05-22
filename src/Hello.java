import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Hello {
    public static void main(String[] args) {
        List<Integer> rnum = getLists(10);        
        rnum.forEach((v) -> {
            System.out.println(v);
        });        
    }

    public static List<Integer> getLists (Integer member) {
        List<Integer> lists = new ArrayList<Integer>();
        Random generator = new Random();
        lists = generator.ints(member, 1, 10).boxed().collect(Collectors.toList());
        return lists;
    }
}