import java.util.HashMap;
import java.util.Map;

public class MapEx {
    // 키 - 값으로 이루어진 데이터. 파이썬 딕셔너리와 비슷한 개념인듯
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        //put을 이용해 내용 추가
        dictionary.put("chicken", "닭");
        dictionary.put("hippo", "하마");
        //get으로 key 값 이용하여 value 값 추출 가능
        System.out.println(dictionary.get("hippo"));
        // remove 를 통해 key 값으로 value 값까지 삭제 가능
        dictionary.remove("hippo");
        System.out.println(dictionary);
    }
}
