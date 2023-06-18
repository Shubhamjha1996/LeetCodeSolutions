package org.example;
//time complexity in O(n).
public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
       int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        int rd=duplicate(arr);

        for(int i=0;i<rd;i++){
            System.out.print(arr[i]+" ");
        }
    }
     static int duplicate(int arr[]){
        int rd=0;
        for(int j=1;j< arr.length;j++){
            if(arr[rd]!=arr[j]){
                rd++;
                arr[rd]=arr[j];

            }
        }
        return rd+1;
    }
}
