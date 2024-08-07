import java.util.ArrayList;

public class lonelyNumber {
    public static void FindLoneNum(ArrayList<Integer> list){
        
        
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) > list.get(i-1) && list.get(i) < list.get(i+1)){
                    return;
                }else{
                    System.out.print(list.get(i)+ " ");
                }
                
            }
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(6); list.add(5); list.add(8);

        FindLoneNum(list);
    }
}
