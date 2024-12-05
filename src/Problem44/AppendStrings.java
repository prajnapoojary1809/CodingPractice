package Problem44;

public class AppendStrings {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "orange";

        String result = appendStrings(str1, str2);
        System.out.println("Result: " + result);
    }

    public static String appendStrings(String str1, String str2) {
        if (str1.length() > 0 && str2.length() > 0 && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            str2 = str2.substring(1);
        }
        return str1 + str2;
    }
}
