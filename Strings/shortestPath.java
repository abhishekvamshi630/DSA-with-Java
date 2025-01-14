public class shortestPath {
    public static float shortest_path(String path){
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++){
            char ch = path.charAt(i);
            // east direction
            if(ch == 'E'){
                 x++;
            }
            // west direction
            else if( ch == 'W'){
                x--;
            }
            // north direction
            else if(ch == 'N'){
                y++;
            }
            // south direction
            else{
                y--;
            }

        }
        
        // shoretest path calculation
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortest_path(path));
    }
}
