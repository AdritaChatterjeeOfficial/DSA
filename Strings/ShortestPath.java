public class ShortestPath {
    public static double findShortestPath(String path){
        int x = 0, y = 0;
        for(int i=0;i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'W'){
                x = x-1;
            } else if(dir == 'E'){
                x = x+1;
            } else if(dir == 'S'){
                y = y-1;                
            }
            else{
                y = y+1;
            }
        }
        double shortestPath = Math.sqrt((x*x) + (y*y));
        return shortestPath;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(findShortestPath(path));
    }
}
