
public class Shellsort {
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		
		while(h < N/3) h = 3*h+1;
		
		while(h >= 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j-h]); j-=h) {
					exch(a, j, j-h);
				}
			}
			h = h/3;
		}
		
	}

	private static boolean less(Comparable v, Comparable w) {
	    return v.compareTo(w) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
	    Comparable temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
	
    private static void printArray(Comparable[] arr) {
        for (Comparable item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
	
    public static void main(String[] args) {
        Double[] arr = { 3.2, 1.5, 4.7, 2.1, 5.3, 0.9 };

        System.out.println("Array antes da ordenação:");
        printArray(arr);

        sort(arr);

        System.out.println("Array após a ordenação:");
        printArray(arr);
    }

}
