import java.util.*;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class stackOperations {
    static class Static{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            if(list.size() == 0){
                return true;
            }
            return false;
        }

        // push Operation

        public static void push(int data){
            list.add(data);
        }

        // pop Operartion
        
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(top);
            return top;
        }

        // peek Operation

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}