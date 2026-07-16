import java.util.*;

public class CreationOfArrays {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //Physics
        marks[1] = sc.nextInt(); //Chemistry
        marks[2] = sc.nextInt(); //Maths

        System.out.println("Phyics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);
    }
}
