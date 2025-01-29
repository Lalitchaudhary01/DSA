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

    //remove first
    //head = head.next
    public int  removeFirst(){
            if(size == null){
                System.out.println("Linked List is empty");
                return -1;
            } else if(size ==1){
                int val = head.data;
                head = null;
                tail = null;
                return val;
            }
       int val = head.data;
         head = head.next;
         return val;
    }
    //remove last
    //tail = null
    //tail = tail.next
    public int removeLast(){
        if(size == 0){
            System.out.println("Linked List is empty");
            return -1;
        } else if(size == 1){
            int val = head.data;
            head = null;
            tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    //remove at index
    //if index == 0
    //remove first
    //if index == size-1
    //remove last
    //else
    //prev = head
    //for i = 0 to index-2
    //prev = prev.next
    //prev.next = prev.next.next
    public int removeAt(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return -1;
        }
        if(index == 0){
            return removeFirst();
        } else if(index == size-1){
            return removeLast();
        } else {
            Node prev = head;
            for(int i=0; i<index-1; i++){
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = prev.next.next;
            size--;
            return val;
        }
    }
    // search for a key in linked list
    // if key is found return true
    // else return false
    public int itrSearch(int key){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data == key){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    //recursive search
    //if head is null return false
    //if head.data == key return true
    //else return search(head.next, key)
    public int recSearch(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 1;
        } else {
            return recSearch(head.next, key);
        }
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.aadFirst(20);
        ll.aadFirst(10);
        ll.addLast(30);
        ll.addLast(40);
        System.out.println(ll.removeFirst());
        
        
      

    }
}