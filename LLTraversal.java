import java.util.*;
public class LLTraversal {
    public static class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        Node(int data){
            this.data = data;
        }
    }

    public static Node Convert(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover=temp;
        }
        return head;
    }

    public static int lengthLL(int[] arr){
        int count = 0;
        Node head = Convert(arr);
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count = count+1;
        }
        return count;
    }


    public static void main(String args[]){
        System.out.println("Enter Length of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elemets of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Node head = Convert(arr);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println("Length of LL is :"+ lengthLL(arr));
    }


}