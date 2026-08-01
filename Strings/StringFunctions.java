public class StringFunctions {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String args[]){

        String str = "Placement";

        System.out.println(str.length());

        //Concatenation
        String firstName = "Adrita";
        String lastName = "Chatterjee";
        String fullName = firstName + lastName; 

        System.out.println(fullName); 


        System.out.println(fullName.charAt(0));


        printLetters(fullName);

    }
}
