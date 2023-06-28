import java.util.Arrays;

public class MergeBU {
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		int i = lo, j = mid + 1;

		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
	}

	private static void sort(Comparable[] a) {
		int N = a.length;
		Comparable[] aux = new Comparable[N];

		for (int sz = 1; sz < N; sz = sz + sz) {
			for (int lo = 0; lo < N - sz; lo += sz + sz) {
				int mid = lo + sz - 1;
				int hi = Math.min(lo + sz + sz - 1, N - 1);
				merge(a, aux, lo, mid, hi);
			}
		}
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public static void main(String[] args) {
		Integer[] array = { 5, 2, 8, 3, 1, 6, 4, 7 };

		System.out.println("Array original: " + Arrays.toString(array));

		MergeBU.sort(array);

		System.out.println("Array ordenado: " + Arrays.toString(array));
	}
}
