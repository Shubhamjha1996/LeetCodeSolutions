package org.example;

public class SecondLargestElementInAnArray_NotSorted {
// time complexity is O(2n),so its O(n).
    public static void main(String[] args) {
       int arr[]={-1,2,4,7,7,5,6};
        System.out.println("Second largest element in an array is: "+secondLargestElement(arr));
    }
    public static int secondLargestElement(int arr[]){
        int largest=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        int secondLargest= Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }return secondLargest;
    }


}
