import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> myFavoriteFoods = new HashSet<>();

        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("피자");
        myFavoriteFoods.add("치킨");

        // Set은 순서가 없고 중복값을 허용하지 않는다.
        System.out.println(myFavoriteFoods);

    }
}
