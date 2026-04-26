package Strings;

public class countPalindromeWordsInAString {
    public static void main(String[] args) {
        String str="Nitin and I are good friends";
        str=str.toLowerCase();
        int count=countPalindromeWords(str);
        System.out.println(count);
    }

    public static int countPalindromeWords(String str){
        String[] words=str.split(" ");
        int count=0;
        for (String word:words){
            if(word.equals(reversedWord(word))){
                count++;
            }
        }
        return count;
    }


    public static String reversedWord(String word){
        StringBuilder sb=new StringBuilder();
        StringBuilder str=sb.append(word);
        return str.reverse().toString();
    }
}
