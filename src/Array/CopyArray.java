package Array;

class CopyArray {
    private int[] copyArr(int[] arr, int startIndex) {
        int len = arr.length;
        int[] copyArray = new int[arr.length - startIndex];

        for (int i = startIndex; i < len; i++) {
            copyArray[i - startIndex] = arr[i];
        }

        return copyArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] numbers2 = numbers;
        numbers2[0] = 0;

        // it's mutable
        System.out.println(numbers[0]);
        System.out.println(numbers2[0]);
        System.out.println("-------");
        // lets create a method for copy array
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // create an object
        CopyArray cloneArray = new CopyArray();

        int[] copyArray = cloneArray.copyArr(numbers3, 4);
        numbers3[9] = 11;

        // it's now immutable
        for (int number: copyArray) {
            System.out.println(number);
        }

        System.out.println("-------");
        // Builtin method

    }
}