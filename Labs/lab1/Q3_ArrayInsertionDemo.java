public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		// Your code here
        beforeArray[indexToInsert - 1] = valueToInsert;
        return beforeArray;
	}

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

	public static void main(String[] args){
		// Your code here
        System.err.println("Array before insertion:");

        int[] array = {1, 5, 4, 7, 9, 6};

        printArray(array);
        
        System.out.println("Array after insertion of 15 at position 3:");

        printArray(insertIntoArray(array, 3, 15));
	}
}