public class Q3_ReverseSortDemo {
	public static void main(String[] args){
		char[] unorderedLetters;
		unorderedLetters = new char[]{'b', 'm', 'z', 'a', 'u'};
		reverseSort(unorderedLetters);
		for (int i = 0 ; i < unorderedLetters.length; i++ )
			System.out.print(unorderedLetters[i]);
	}

	//method that sorts a char array into its reverse alphabetical order
	public static void reverseSort(char[] values){
        boolean notSorted = true;
        while (notSorted) {
            int swaps = 0;

            for (int i = 0; i < values.length - 1; i++) {
                int val1 = values[i];
                char firstChar = values[i];
                int val2 = values[i + 1];

                if (val1 < val2) {
                    values[i] = values[i + 1];
                    values[i + 1] = firstChar;

                    swaps++;
                }
            }

            if (swaps == 0) {
                notSorted = false;
            }
        }
		//your code here
	}

}
