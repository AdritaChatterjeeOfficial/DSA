public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        for(int i=0; i<sb.length()/2; i++){
            int start = i;
            int end = sb.length()-i-1;

            char startChar = sb.charAt(start);
            char endChar = sb.charAt(end);

            sb.setCharAt(start, endChar);
            sb.setCharAt(end, startChar);
        }

        System.out.println(sb);

    }
}
