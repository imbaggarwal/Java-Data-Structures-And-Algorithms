package Strings;
import java.util.ArrayList;
import java.util.Collections;

// Given a string S consisting of only uppercase and lowercase characters.
// The task is to sort uppercase and lowercase letters separately such that
// if the ith place in the original string had an Uppercase character then it should not have a
// lowercase character after being sorted and vice versa.

public class SortLowerCaseAndUpperCase {
    static String caseSort(String str){
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                list1.add(ch);
            }
            else{
                list2.add(ch);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        int i = 0;
        int j = 0;

        for(int k=0; k<str.length(); k++){
            char ch = str.charAt(k);

            if(ch >= 'a' && ch <= 'z'){
                sb.append(list1.get(i));
                i++;
            }
            else{
                sb.append(list2.get(j));
                j++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "defRTSersUXI";
        System.out.println(caseSort(str));
    }
}
