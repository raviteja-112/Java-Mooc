
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 0;i<number;i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = 1;i<size+1;i++){
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for(int i = 1;i<height+1;i++){
            printSpaces(height-i);
            for(int j = 0;j<i-1;j++){
                System.out.print("*");
            }
            printStars(i);
        }
        for(int i = 1;i<=2;i++){
            printSpaces(height-2);
            printStars(3);
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
