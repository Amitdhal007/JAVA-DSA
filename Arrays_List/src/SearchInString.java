import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "AmitKumarDhal";
        System.out.println(Arrays.toString(name.toCharArray()));
//        int ans = SearchCharInString(name,'x');
//        System.out.println(ans);
        System.out.println(SearchCharInString3(name,'D'));
    }


    // for each loop
    static boolean SearchCharInString3(String str,char target){
        if(str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (target == ch){
                return true;
            }
        }

        return false;
    }



    // returning char's ascii value if found
    static int SearchCharInString1(String str,char target){
        if(str.length() == 0){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (target == ch){
                return ch;
            }
        }

        return Integer.MAX_VALUE;
    }


    // returning index of character
    static int SearchCharInString(String str,char target){
        if(str.length() == 0){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (target == ch){
                return i;
            }
        }

        return -1;
    }
}
