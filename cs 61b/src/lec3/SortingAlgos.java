package lec3;

import java.util.Arrays;
import java.util.List;

public class SortingAlgos {

	public Integer[] sortIntArray(Integer[] in) {

		int isFinished = 0;
		int len = in.length;
		int lastChange  = 0;
		while (isFinished != 1) {
			isFinished = 1;
			//System.out.println(len);
			for (int i = 0; i < len-1; i++) {

				if (in[i] > in[i + 1]) {
					in[i] = in[i] + in[i + 1];
					in[i + 1] = in[i] - in[i + 1];
					in[i] = in[i] - in[i + 1];
					isFinished = 0;
					lastChange = i+1;
				}
			}
			len = lastChange;
		}
		return in;
	}

	public static void main(String args[]) {

		Integer[] res = new SortingAlgos().sortIntArray(new Integer[] { 5, 6,
				3, 1, 8, 7, 2, 4 });
		List<Integer> l = Arrays.asList(res);
		l.forEach(System.out::println);

	}

}
