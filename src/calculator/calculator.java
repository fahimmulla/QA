package calculator;

import java.util.Arrays;

public class calculator {

	public static void calculus(int[] array) throws ArithmeticException {

		Arrays.sort(array);

		if (array[0] != 0 && array[2] / array[0] == array[1]) {
			System.out.println(array[2] + "/" + array[0] + "=" + array[1]);
		}

		if (array[1] != 0 && array[2] / array[1] == array[0]) {
			System.out.println(array[2] + "/" + array[1] + "=" + array[0]);
		}

		if (array[0] * array[1] == array[2]) {
			System.out.println(array[0] + "*" + array[1] + "=" + array[2]);
		}

		if (array[1] * array[0] == array[2]) {
			System.out.println(array[1] + "*" + array[0] + "=" + array[1]);
		}

		if (array[1] + array[0] == array[2]) {
			System.out.println(array[1] + "+" + array[0] + "=" + array[2]);
		}

		if (array[2] - array[1] == array[0]) {
			System.out.println(array[2] + "-" + array[1] + "=" + array[0]);
		}

		if (array[2] - array[0] == array[1]) {
			System.out.println(array[2] + "-" + array[0] + "=" + array[1]);
		}

		// for(int i=0;i<array.length;i++) {
		// System.out.println(array[i]);}
		// return array;
	}

	public static void main(String[] args) throws ArithmeticException {
		// calculus (3,5,10);*/
		int[] Arrayname = { 12, 3, 4 };
		int[] Arrayname1 = { 1, 1, 1 };
		int[] Arrayname2 = { 1, 2, 0 };
		calculus(Arrayname);
		calculus(Arrayname1);
		calculus(Arrayname2);

	}

}
