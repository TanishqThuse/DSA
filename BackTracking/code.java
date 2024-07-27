class Backtracking{
    public static void printPermutation(String str,  String perm){
        
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length; i++){
            char currChar = str.charAt(i);
            char newStr = str.substring(0,i) + str.substring(i+1);
            // perm = perm 
            printPermutation(newStr, perm+currChar, idx+1);
        }
    }

    public static void main(String args[]){
        String str = "ABC";
    }
}