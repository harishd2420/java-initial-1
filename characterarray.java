import java.util.Scanner;

public class characterarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int[] arr = new int[5]; 

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            arr[i] = scanner.nextInt(); 
        }

        System.out.println("The numbers you entered are:");
        for (int i = 0; i < 5; i++1) {
            System.out.print(arr[i] + " ");
        }
        
        scanner.close(); 
    }
}
