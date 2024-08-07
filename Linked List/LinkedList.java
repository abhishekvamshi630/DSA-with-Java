import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class LinkedList{
    // creating a node
    public static class Node{
        int data;
        Node next;
        // creating a constructer
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    // to check the size
    static int size;

    // Adding the Node in  the Last

    public void addLast(int data){
        // creating a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // tail.next --> newNode
        tail.next = newNode;
        // newNode -> Tail
        tail = newNode;
    }

    // Adding the node in the First

    public void addFirst(int data){
        // creating a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // newNode next = head
        newNode.next = head;// link to next node
        // newNode = head
        head = newNode;
    }

    // Adding the Node in the Middle

    public void addMiddile(int idx, int data){
        // when the idx = 0
        if(idx == 0){
            addFirst(data);
            return;
        }
        //creating a new Node
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1, temp --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove First LinkedList

    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    // Remove Last

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int value = head.data;
            head = tail = null;
            return value;
        }

        Node prev = head;
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }
        int val = prev.data; // tail.data
        prev.next = null;
        prev = tail;
        size--;
        return val;
    }

    // Iterator Search

    public int IteratorSearch(int key){
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }

        return -1;
    }

    // Recursisve Search
    // creatinfg a Helper Function
    public int helperFunction(Node head, int key){
        // Base case
        if(head == null){
            return-1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helperFunction(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int RecursisveSearch(int key){
        return (helperFunction(head, key));
    }

    // Reverse a Linked List

    public void ReverseLL(){
        Node prev = null; // head previous = null
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev; 
    }

    // Remove nth node From End

    public void removeNthFromEnd(int n){
        //Calculate the size 
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while ((i < iToFind)) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return; 

    }

    // check palindrome or not

    // to find mid node 
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){ // for even or odd no of nodes
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid Node 
    }

    //check palindrome
    public boolean checkPalindrome(){
        // base case
        if(head == null || head.next == null ){
            return true;
        }
        // find mid node
        Node midNode = findMid(head);

        //reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while ((curr != null)) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // check 1st half and 2nd half

        while(right != null){
            if(right.data != left.data){
                return false;
            }

            right =  right.next;
            left = left.next;
        }
        return true;
    }

    // detect cycle/loop in a a linkedList

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if(slow == fast){ // cycle exists
                return true;
            }
        }

        return false; // Cycle does not exists
    }

    // REMOVE CYCLE FROM LL

    public static void removeCycle(){
        // detect a cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while ((fast != null && fast.next != null)) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if ((cycle == false)) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null; // last node
        while ((slow != fast)) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle
        prev.next = null;
    }

    // Merge Sort

    //To find Mid Node

    private Node mid(Node heaNode){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;// mid Node
    }

    // To Merge

    private Node merge(Node head1, Node head2){
        Node mergell = new Node(-1);
        Node temp = mergell;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2.next = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2.next = head2.next;
            temp = temp.next;
        }

        return mergell.next;
    }

    public Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }
        // Find MidNode
        Node midNode = mid(head);

        // //Divide the LL into two Halfs
        Node rightHead = midNode.next;
        midNode.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //Merge

        return merge(newLeft, newRight);
    }
    
    public void  print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Zig zag

    public void zizZag(){
        // find Mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // revere 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        // to reverse the LL
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // Alternate merging
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // Update
            right = nextR;
            left = nextL;
        }
        
    }
    public static void main(String[] args) {
        // craeting Linked List
        LinkedList ll = new LinkedList();

        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.addMiddile(2, 6);
        // ll.print();

        // // ll.removeFirst();
        // // ll.print();

        // // ll.removeLast();
        // // ll.print();

        // ll.ReverseLL();
        // ll.print();
        // ll.removeNthFromEnd(3);
        // ll.print();
        // System.out.println("Key value at : " + ll.RecursisveSearch(6));

        // System.out.println("Size of the Linked List : "+ ll.size);

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.checkPalindrome());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();

        ll.zizZag();
        ll.print();

    //     ll.head = ll.mergeSort(ll.head);
    //     ll.print();
    // 
    }
}