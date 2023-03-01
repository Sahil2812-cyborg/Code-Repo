import java.util.ArrayList;
import java.util.List;

public class Backtracking{

    //count the number of paths from start to end given the rows and columns of matrix
    public static int countPaths(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int r_c = countPaths(r-1, c);
        int c_c = countPaths(r,c-1);
        return r_c + c_c;
    }

    public static void paths(String s, int r, int c){
        if(r==1 && c==1){
            System.out.println(s);
            return;
        }
        if(r>1){
        paths(s+"D", r-1,c);
        }
        if(c>1){
        paths(s+"R",r,c-1);
        }
        return;
    }

    public static List<String> printList(String p, int r, int c, List<String> list){
        if(r==1 && c==1){
            list.add(p);
            return list;
        }
        if(r>1){
            printList(p+"D", r-1,c, list);
        }
        if(c>1){
            printList(p+"R                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", r,c-1, list);
        }
        return list;

    }
    public static void main(String[] args) {

        // System.out.println(countPaths(4,4));
        // paths("", 3, 3);
        
        System.out.println(printList("", 3, 3, new ArrayList<>()));
        
    }
}