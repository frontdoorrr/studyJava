import java.util.ArrayList;
import java.util.List;

public class ListEx{
    public static void main(String[] args) {
        // 리스트 생성 방법 3가지
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<Integer>();
//        ArrayList<Integer> list3 = new ArrayList<>();
        List<String> list = new ArrayList<>();
        // 리스트에 요소 추가
        list.add("치킨");
        list.add("피자");
        // 리스트에서 요소 삭제
        list.remove("치킨");
        list.remove(0);
        // 리스트에서 요소 찾기
        boolean containsChicken = list.contains("치킨");

        System.out.println(list);
        System.out.println(containsChicken);
    }
}
