package org.shellrie.algsds.algorithms.sort;

public class SelectionSort<T> extends Sort<T> {

	@SuppressWarnings("unchecked")
	@Override
	public void sort(Comparable<T>[] items) {
		for(int i = items.length - 1; i > 0; i--) {
			int maxIndex = 0;
			for(int j = 0; j <= i; j++) {
				if(items[j].compareTo((T)items[maxIndex]) > 0) {
					maxIndex = j;
				}
			}
			
			swap(items, maxIndex, i);
		}
	}

}
