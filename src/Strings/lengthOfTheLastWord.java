package Strings;

public class lengthOfTheLastWord {
    public static void main(String[] args) {
        String phrase="a girl living in a hut";
        int length=LastWordLength(phrase);
        System.out.println(length);
    }

    public static int LastWordLength(String phrase){
        char[] arr=phrase.toCharArray();
        int len=arr.length;
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if (arr[i] == ' '){
                break;
            }
            count++;
        }

        return count;
    }
}
