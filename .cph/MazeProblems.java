import java.util.ArrayList;

public class MazeProblems {

    public static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count (r,c-1);

        return left+right;
    }


    public static void printPath(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if(row > 1){
            printPath(p+'D', row-1, col);
        }

        if(col > 1){
            printPath(p+'R', row, col-1);
        }
    }

    public static ArrayList<String> allPaths(int row, int col){
        ArrayList <String> list = new ArrayList<>();
        String path = "";
        return returnPath(list, path, row, col);
    }

    public static ArrayList<String> returnPath(ArrayList<String> list, String p, int r, int c){
        if(r == 1 && c == 1){
            list.add(p);
            return list;
        }

        if(r > 1){
            returnPath(list, p+'D', r-1, c);
        }

        if(c > 1){
            returnPath(list, p+'R', r, c-1);
        }
        return list;

    }



    public static void main(String[] args) {
        System.out.println(count(3,3));
        printPath("", 3, 3);
        System.out.println(allPaths(3, 3));
    }
}
