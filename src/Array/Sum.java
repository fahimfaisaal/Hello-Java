package Array;

public class Sum {
	 public static long arraySum(long[] arr) {
		  long sum = 0L;

		  for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
		  }

		  return sum;
	 }

	 public static void main(String[] args) {
		  long[] array = {123212, 1232421, 12342421, 2323241};

		  long result = arraySum(array);

		  System.out.println(result);
	 }
}