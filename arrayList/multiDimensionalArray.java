import java.util.ArrayList;

public class multiDimensionalArray {
    public static void main(String[] args) {
        // multi Dimensioal  Array ( Main Array)
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();

        // Assing the values to the list
        for(int i = 1; i <= 5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        // MainList
        System.out.println(mainList);

        // Print in 3D
        for(int i = 0; i < mainList.size(); i++){
            // creating current list
            ArrayList<Integer> curr = mainList.get(i);
            for(int j = 0; j < curr.size(); j++){
                System.out.print(curr.get(j)+ " ");
            }
            System.out.println();
        }

        
        
    }
}
