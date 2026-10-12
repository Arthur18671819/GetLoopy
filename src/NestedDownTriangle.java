public class NestedDownTriangle {
    public static void main(String[] args) {
        int size = 5; // set the size of the triangle

        // outer loop for rows
        for (int i = 0; i < size; i++) {

            // inner loop for columns
            for (int j = 0; j < size - i; j++) {
                System.out.print("* "); // print asterisk
            }
            System.out.println(); // move to the next line
        }
    }
}
