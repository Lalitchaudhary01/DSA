public class LinkedList{
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    //methods
    //for adding in linkedlist first
    //add in LinkedLIst
    //step 1 create new node
    //step 2 new node's next = head
    //step 3 head = new node

     public void aadFirst(int data){
        
        //step1 
        Node newNode = new Node(data);
        //if linkedlist is empty
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        //step2
         newNode.next = head;  //linkedlist

        //step3
        head = newNode;
     }
    //for adding in linkedlist last
    //create  a new node
    //tail.next = new node
    //tail = new node

    public void addLast(int data){
        //step1
        Node newNode = new Node(data);
        //if linkedlist is empty
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        //step2
        tail.next = newNode;
        //step3
        tail = newNode;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.aadFirst(20);
        ll.aadFirst(10);
        ll.addLast(30);
        ll.addLast(40);
      

    }
}