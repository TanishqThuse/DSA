import java.util.*;

class code{
    
    static class Node{
        Node[] children;
        boolean endOfWord;

        Node(){
            children = new Node[26]; //a to z
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
        
    }

    static Node root = new Node();
    
    public static void insert(String word){
        Node curr = root;
        
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(curr.children[index]==null){
                //We add a new node
                root.children[index] = new Node();
            }
            if(i == word.length()-1){
                curr.children[index].endOfWord = true;
            }
            root = root.children[index];
        }
    }

    public static boolean search(String word){
        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(curr.children[index] == null){
                // System.out.println("Word not found");
                return false;
            }
            if(i==word.length()-1 && curr.children[index].endOfWord == false){
                // System.out.println("Word not found");
                return false;
            }
        }
        return true;
    }

    //Logic for this code is a bit not understood from recursion point of view
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        
        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        
        String words[] = {"hello", "world", "java", "code", "programming", "language"};
        String key = "helloworld";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(wordBreak(key));

    }
}