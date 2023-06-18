package org.example;

public class LargestElementInAnArray {
// o(n) time complexity
    public static void main(String[] args) {
        int arr[]={3,2,-1,5,2,-9};
        System.out.println("Largest element in the array: "+largest(arr));
    }
    public static int largest(int[] arr){
        int largest=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

        }return largest;
    }

}
