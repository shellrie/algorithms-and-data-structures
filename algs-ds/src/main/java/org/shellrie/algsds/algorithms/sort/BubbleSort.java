package org.shellrie.algsds.algorithms.sort;

public class BubbleSort<T> extends Sort<T> {

	@SuppressWarnings("unchecked")
	public void sort(Comparable<T>[] items) {
		for(int i = items.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(items[j].compareTo((T)items[j + 1]) > 0) {
					swap(items, j, j + 1);
				}
			}
		}
	}
}
