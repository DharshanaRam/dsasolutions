public class MazeRunner{

    static String mazeRunner(int[][] maze,String[] directions){
        String result = "Dead";
        int X = -1;
        int Y = -1;
        int rowNum = maze.length;
        int colNum = maze[0].length;
        for(int i = 0;i<rowNum;i++){
            for(int j = 0;j<colNum;j++){
                if(maze[i][j] == 2){
                    X = i;
                    Y = j;
                }
            }
        }
        for(String direction : directions){
            switch(direction){
                case "N" : X--;break;
                case "S" : X++;break;
                case "E" : Y++;break;
                case "W" : Y--;break;
            }
            if(X==-1 || Y==-1 || X==7 || Y==7){
                return result;
            }
            if(maze[X][Y]==0){
                continue;
            }else if(maze[X][Y]==3){
                return "Finish";
            }else{
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] maze = new int[][]{ { 1, 1, 1, 1, 1, 1, 1 },
        { 1, 0, 0, 0, 0, 0, 3 },
        { 1, 0, 1, 0, 1, 0, 1 },
        { 0, 0, 1, 0, 0, 0, 1 },
        { 1, 0, 1, 0, 1, 0, 1 },
        { 1, 0, 0, 0, 0, 0, 1 },
        { 1, 2, 1, 0, 1, 0, 1 } };
        String[] directions = new String[] { "N", "N", "N", "N", "N", "E", "E", "E", "E", "E" };
        System.out.println("Test Case 1 - "+mazeRunner(maze,directions)); 

        directions = new String[] { "N","N","N","N","N","E","E","S","S","E","E","N","N","E" };
        System.out.println("Test Case 2 - "+mazeRunner(maze,directions));

        directions = new String[] { "N","N","N","N","N","E","E","E","E","E","W","W" };
        System.out.println("Test Case 3 - "+mazeRunner(maze,directions));

        directions = new String[] { "N","N","N","W","W" };
        System.out.println("Test Case 4 - "+mazeRunner(maze,directions));

        directions = new String[] { "N","N","N","N","N","E","E","S","S","S","S","S","S" };
        System.out.println("Test Case 5 - "+mazeRunner(maze,directions));

        directions = new String[]  { "N","E","E","E","E" };
        System.out.println("Test Case 6 - "+mazeRunner(maze,directions));
    }

}