import java.util.*;
import java.lang.*;
import java.io.*;

class Total{    
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-->0){
           int n = sc.nextInt();
           int [] arr = new int[n];
           int degree = 0;

           for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if (arr[i] != 0){
                    degree = i;
           } 
           }
           System.out.println(degree);

        }

        
    }
}

