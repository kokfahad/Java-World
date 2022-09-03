import java.util.HashMap;
import java.util.Map;

public class Decode_Message {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

        HashMap<Character,Character> map = new HashMap();

        String newKey = key.replaceAll(" ","");

        char[] ch = newKey.toCharArray();
        System.out.println(ch);

        char a = 'a';
        for(char c : ch){
            map.putIfAbsent(c,a);
            a++;
            System.out.println("testKey : " + c + " val: " + a);
        }

        for (Map.Entry<Character,Character>m : map.entrySet()){
            System.out.print("Key: "+ m.getKey()+ " value :"+ m.getValue());
        }

//        String ans="";
//        char[] msg = message.toCharArray();

//        for(char m : msg){
//            ans +=map.get(m);
//        }
//        System.out.println(ans);
    }
}
