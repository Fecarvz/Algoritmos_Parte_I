import java.util.Arrays;

public class Mergesort {
	private static void merge(Comparable[]a, Comparable[] aux, int lo, int mid, int hi) {
		for (int k = lo; k <= hi; k++)
			aux[k] = a[k];
		
		int i = lo, j = mid+1;
		
		for (int k = lo; k <= hi; k++) {
			if (i > mid)                   a[k] = aux[j++];
			else if (j > hi)               a[k] = aux[i++];
			else if (less(aux[j], aux[i])) a[k] = aux[j++];
			else                           a[k] = aux[i++];
		}
	}
	
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if (hi <= lo) return;
		int mid = lo + (hi - lo) / 2;
		sort(a,aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	}
	
	private static boolean less(Comparable v, Comparable w) {
	    return v.compareTo(w) < 0;
	}
	
	public static void main(String[] args) {
	    Integer[] array = {5, 2, 8, 3, 1, 6};
	    
	    System.out.println("Array original: " + Arrays.toString(array));
	    
	    Mergesort.sort(array, new Comparable[array.length], 0, array.length - 1);
	    
	    System.out.println("Array ordenado: " + Arrays.toString(array));
	}
}
