//public class LengthOfString {
//    public static void main(String[] args) {
//        String myString = "Compiler";
//        int count = 0;
//        for (int i = 0; i < myString.length(); i++) {
//            count++;
//        }
//        System.out.println("Length of the string: " + count);
//    }
//}
//
public class LengthOfString {
    public static void main(String[] args) {
        String myString="Compiler";
        int result=count(myString);
        System.out.println("Length of given string is: "+result);
    }

    public static int count(String myString){
    int count=0;
        for (int i = 0; i < myString.length(); i++){
             count++;
        }return count;
    }
}
