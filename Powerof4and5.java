import java.util.Scanner;

public class whileex {
    public static void main(String[] args){
        int number, i = 1, j = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        while (number > i){
            i *= 4;
            while (number > j){
                System.out.println(j);
                j *= 5;
            }
            if (number < i) break;
            System.out.println(i);

        }
    }
}
