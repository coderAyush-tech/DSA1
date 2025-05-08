import java.util.*;;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();   
        Node head = new Node(sc.nextInt()); 
        Node temp = head;
        for(int i=0;i<n-1;i++){
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

    
    //     Node head = new Node(sc.nextInt());
    //     head.next = new Node(sc.nextInt());
    //     head.next.next = new Node(sc.nextInt());
    //     head.next.next.next = new Node(sc.nextInt());
    //     head.next.next.next.next = new Node(sc.nextInt());

      
        printList(head);
        evennumber(head);
        copy(head);
    }

    public static void printList(Node head) {
        Node temp = head;
        int count=0;
    while (temp != null) {
    
        System.out.print(temp.data + " -> ");
     
        temp = temp.next;
        count++;
    }
    System.out.println("null");
   
    System.out.println("count is " + count);
    
}

public static void evennumber(Node head) {
    int sum=0;
    Node temp = head;
    while (temp != null) {

      if(temp.data % 2 == 0) {
        System.out.print(temp.data + " "); 

            sum += temp.data;
            
        }

        temp = temp.next;

    }
    System.out.println("sum is "+sum);
    
   
}
public static void copy(Node head){
    Node temp1 = head;
    System.out.println("enter the array size");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the array elements");
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    int i = 0;

    while (temp1 != null&&i<n) {
       
            temp1.data = arr[i]; 
            System.out.print(temp1.data + " ");
            i++;
        
       
        temp1 = temp1.next;
        
    }
}
}