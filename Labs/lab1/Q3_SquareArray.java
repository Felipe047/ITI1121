public class Q3_SquareArray{

	public static int[] createArray(int size) {
		int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        return array;
	}

	public static void main(String[] args){
		int[] intArray = createArray(13);

        for (int i = 0; i < intArray.length; i++) {
            int sqr = intArray[i] * intArray[i];

            System.out.println("The square of " + intArray[i] + " is: " + sqr);
        }
	}
}