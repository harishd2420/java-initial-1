public class PrintYShape {
    public static void main(String[] args) {
        int height = 7; 
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
               
                if (i == j && i < height / 2) {
                    System.out.print("#");
                
                } else if (i + j == height - 1 && i < height / 2) {
                    System.out.print("#");
                // Print the stem of 'Y'
                } else if (i >= height / 2 && j == height / 2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
