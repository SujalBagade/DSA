import java.util.*;
public class SecondLargestElement {
    public static void main(String args[]){
        System.out.println("Enter Length of array");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elemts of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element is " +secondLargest);
    }
}
