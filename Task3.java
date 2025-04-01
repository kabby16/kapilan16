import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = s.nextInt();
        
        int mulOf5 = value / 5 * 5;
        int divBy3 = value / 3 * 3;
        
        if (value == mulOf5) {
            if (value == divBy3) {
                System.out.println("It is multiple of 5 and divisible of 3");
            } else {
                System.out.println("Multiple of 5");
            }
        } else {
            if (value == divBy3) {
                System.out.println("Divisible of 3");
            } else {
                System.out.println("Neither multiple of 5 nor divisible of 3");
            }
        }
        
    }
}
