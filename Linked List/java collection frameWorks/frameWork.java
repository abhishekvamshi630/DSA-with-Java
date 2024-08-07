import java.util.LinkedList;
public class frameWork{
    public static void main(String args[]){
        //Create LinkedList
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.add(2);
        ll.addLast(3);
        ll.addFirst(4);

        System.out.println(ll);

        //Remove

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}