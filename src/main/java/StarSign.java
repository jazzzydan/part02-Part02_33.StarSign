
public class StarSign {

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int start = 0;
        while (start < number) {
            System.out.print("*");
            start++;
        }

        System.out.println("");
    }

    public static void printSquare(int size) {
        int numberOfTimes = 0;
        while (numberOfTimes < size) {
            printStarts(size);
            numberOfTimes++;
        }
    }

    public  static void printStarts(int size) {
        int start = 0;
        while (start < size) {
            System.out.print("*");
            start++;
        }

        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        int numberOfTimes = 0;
        while (numberOfTimes < height) {
            printStarts(width);
            numberOfTimes++;
        }
    }

    public static void printTriangle(int size) {
        int numberOfTimes = 0;
        int hypothenuse = 1;

        while (numberOfTimes < size) {
            printStarts(hypothenuse);
            numberOfTimes++;
            hypothenuse++;
        }
    }
}
