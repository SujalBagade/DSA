import java.util.*;

public class converttoLL{
    public static class node{
        int data;
        node next;
        node(int data, node next){
            this.data = data;
            this.next = null;
        }
        node(int data){
            this.data = data;
        }
    }
    public static node convettoLL(int[] arr){
        node head = new node(arr[0]);
        node mover = head;
        for(int i=1;i<arr.length;i++){
            node temp = new node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String args[]){
        System.out.println("Enter length of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements of Array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        node head = convettoLL(arr);
        System.out.println("LL Elementis "+ head.data);        
    }
}