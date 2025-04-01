import java.util.Scanner;
class Task2 {
public static void main(String[] args) {
    System.out.print("Enter the NO. : ");
    Scanner input = new Scanner(System.in);
   
    int value = input.nextInt(); 
    if (value>10){
        if(value<100){
        System.out.println("\"Number\"");
         }else{
        System.out.println("\"Big Number\"");
        }
    }else{
        System.out.println("\"Small Number\"");
    }
    }
}