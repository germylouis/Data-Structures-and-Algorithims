package SortingAlgorithims;

public class InsertionSort {

    void sortInt(int intArray[]) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
             firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];

            int i = Integer.parseInt("1");

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
