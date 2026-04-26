package Strings;


//we'll be using the horizontal scanning method for this question
public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] str={"flower","flow","flight"};
        String prefix=longestCommonPrefix(str);
        System.out.println(prefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
