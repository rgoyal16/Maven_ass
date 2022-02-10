public class StringFunction {
    public static String reverseString(String str){
        StringBuilder reverse_string = new StringBuilder();
        reverse_string.append(str);
        reverse_string.reverse();
        return String.valueOf(reverse_string);
    }
    public static int sizeofString(String str){
        return str.length();
    }
}