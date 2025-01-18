public class PrintLinkedList {
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
    public static void printLinkedList(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Add in the middle
    //step 1
    //create a new node
    //step 2
    //find the middle node
    //step 3
    //new node's next = middle.next
    //step 4
    //middle.next = new node
    public void addMiddle(int data){
        //step1
        Node newNode = new Node(data);
        //step2
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //step3
        newNode.next = slow.next;
        //step4
        slow.next = newNode;
    }
    public static void main(String args[]){
        PrintLinkedList ll = new PrintLinkedList();
        ll.aadFirst(20);
        ll.aadFirst(10);
        ll.addLast(30);
        printLinkedList();
    }
    
}
