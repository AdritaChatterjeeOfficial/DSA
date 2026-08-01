public class CountLowercaseVowels {
    public static int count(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }

        return (int)count;
    }
    public static void main(String[] args) {
        String str = "JaVaDsA";
        System.out.println(count(str));
    }
}
