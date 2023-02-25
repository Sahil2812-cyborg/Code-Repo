import java.util.Arrays;

public class ReverseSent {
    public static String rev(String str){
        String[] up = str.split(" ");
        int aptr = 0;
        int bptr = up.length - 1;
        while(aptr < bptr){
            String temp = up[aptr];
            up[aptr] = up[bptr];
            up[bptr] = temp;
            aptr++;
            bptr--;
        }
        String res = "";
        for(int i=0;i<up.length;i++){
            res += up[i];
            res += " ";
        }

        System.out.println(Arrays.toString(up));
        System.out.println(res);
        return res;
        // return reverseRoutine(up, index, up.length-1);
    }

    public static void reverse(String str){
        String[] up = str.split(" ");
        reverseRoutine(up, 0, up.length-1);
        String res = "";
        for(int i=0;i<up.length;i++){
            res += up[i];
            res += " ";
        }
        System.out.println(res);

    }

    public static void reverseRoutine(String[] up, int a_ptr, int b_ptr){
        if(a_ptr > b_ptr ){
            return;
        }
        String temp = up[a_ptr];
        up[a_ptr] = up[b_ptr];
        up[b_ptr] = temp;
        reverseRoutine(up, a_ptr+1, b_ptr-1);
    }
    public static void main(String[] args) {
        rev("This is a String");
        reverse("This is also a string");
    }   
}
