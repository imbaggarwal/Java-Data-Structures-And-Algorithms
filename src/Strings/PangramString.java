package Strings;
import java.util.HashMap;

public class PangramString {
    public static boolean checkPangram (String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            else if(ch >= 'A' && ch <= 'Z'){
                map.put((char)(ch + 'a' - 'A'), map.getOrDefault((char)(ch + 'a' - 'A'), 0) + 1);
            }
        }
        return map.size() == 26;
    }

    public static void main(String[] args) {
        String str = "Bawds jog, flick quartz, vex nymph";

        System.out.println(checkPangram(str));
    }
}
