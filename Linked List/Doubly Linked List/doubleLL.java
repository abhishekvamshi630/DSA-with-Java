public class doubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        // create constructor
        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int size;

        // add first
        public void addFirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        // add Last

        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        // remove Last
        public int removeLast(){
            if(head == null){
                System.out.println("Dll is Empty");
                return Integer.MIN_VALUE;
            }
            if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }

            int val = tail.data;
            tail = tail.prev;
            tail.next = null;
            size--;
            return val;
        }

        // print doubly LL
        public void  print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ "<->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public int RemoveFirst(){
            if(head == null){
                System.out.println("Duble LL is empty");
                return Integer.MIN_VALUE;
            }

            if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }

            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }

        // Reverse of dLL

        public void reverseDll(){
            Node curr = head;
            Node prev = null;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                curr.prev = next;

                prev = curr;
                curr = next;
            }

            head = prev;
        }


    

    
    public static void main(String[] args) {

        doubleLL dll = new doubleLL();

        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.addLast(0);

        dll.print();
        dll.RemoveFirst();
        dll.print();
        
        dll.reverseDll();
        
        dll.print();
        




    }
}