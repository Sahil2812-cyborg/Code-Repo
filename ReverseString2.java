public class ReverseString2 {
    public static void reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }   
    public static void main(String[] args) {
        reverse("Null is not a value");
    }
}
