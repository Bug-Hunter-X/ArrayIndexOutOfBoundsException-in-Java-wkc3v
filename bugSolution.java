public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 10; //This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds.");
            // Handle the exception appropriately
        }
        // ...rest of the code
    }
}