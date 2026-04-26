package Strings;

public class duplicateCharacters {
    public static void main(String[] args){
        String word="apple";
        StringBuilder character=duplicateCharacter(word);
        System.out.println(character);
    }

    public static StringBuilder duplicateCharacter(String word){
        StringBuilder sb=new StringBuilder();
        int[] freq=new int[256];
        for(char c:word.toCharArray()){
            freq[c]++;
        }

        for(int i=0;i<256;i++){
            if(freq[i]>1){
                sb.append((char)(i));
            }
        }
        return sb;
    }
}
