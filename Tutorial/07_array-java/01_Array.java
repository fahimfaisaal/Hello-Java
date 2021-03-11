public class Array {
    public static void main(String[] args) {
        // array with range
        byte[] byteNumber = new byte[10];
        int[] integeNumber = new int[10];
        float[] floatingNumber = new float[10];
        double[] doubleNumber = new double[10];
        char[] letters = new char[10];

        floatingNumber[0] = 1.5F;
        floatingNumber[1] = 2.5F; // got error if the index number getter than the initial range

        System.out.println(floatingNumber[1]);

        // array of byte
        byte[] ages = {22, 12, 23, 45, 20, 10, 8, 30};
        int adultCounter = 0,
            notAdultCounter = 0;

        for (byte age: ages) {
            if (age > 18) {
                adultCounter++;
            } else {
                notAdultCounter++;
            }
        }

        System.out.println("The number of adult = " + adultCounter + "\n" + "The number of child = " + notAdultCounter);

        // array of short
        short[] shortNumbers = {1234, 5653, 2312, 3432, 1223};
        System.out.println("Short numbers ->");

        for (short shortNum: shortNumbers) {
            System.out.println(shortNum);
        }

        // array of int
        int[] randomNumbers = {13321, 2324211, 2344123, 1234421, 634123, 12353, 10000};
        System.out.println("Integer numbers ->");

        for (int randNumber: randomNumbers) {
            System.out.println(randNumber);
        }

        char[] alphabets = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Letters ->");

        for (char letter: alphabets) {
            System.out.println(letter);
        }
    }
}