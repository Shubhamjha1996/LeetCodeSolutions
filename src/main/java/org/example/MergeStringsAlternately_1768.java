package org.example;

//        Example 1:
//
//        Input: word1 = "abc", word2 = "pqr"
//        Output: "apbqcr"
//        Explanation: The merged string will be merged as so:
//        word1:  a   b   c
//        word2:    p   q   r
//        merged: a p b q c r

//          Example 2:
//
//        Input: word1 = "ab", word2 = "pqrs"
//        Output: "apbqrs"
//        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//        word1:  a   b
//        word2:    p   q   r   s
//        merged: a p b q   r   s


//time complexity=O(n),space=O(1)
public class MergeStringsAlternately_1768 {
    public static void main(String[] args) {
       String word1 = "abc", word2 = "pqr";
        System.out.println("By two pointer:"+mergeAlternately(word1,word2));
        System.out.println("By one pointer:"+mergeAlternately1(word1,word2));

    }

//two pointers approach
    public static String mergeAlternately(String word1, String word2) {
     int l1=word1.length();
     int l2=word2.length();
     StringBuilder result=new StringBuilder();
     int i=0,j=0;
     while(i<l1 || j<l2){
         if(i<l1){
             result.append(word1.charAt(i++));
         }
         if(j<l2){
             result.append(word2.charAt(j++));
         }
     }
     return result.toString();
    }

    //one pointer technique
    public static String mergeAlternately1(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        StringBuilder result=new StringBuilder();


        for (int i = 0; i < Math.max(l1, l2); i++) {
            if (i < l1) {
                result.append(word1.charAt(i));
            }
            if (i < l2) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();

    }
}
