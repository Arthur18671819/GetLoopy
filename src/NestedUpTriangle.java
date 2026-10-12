public class NestedUpTriangle {
    public static void main(String[] args) {
        int size = 5; // set the size of the triangle

        // outer loop for rows
        for (int i = 0; i < size; i++) {

            // inner loop for asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("* "); // print asterisk
            }
            System.out.println(); // move to the next line
        }
    }
}
