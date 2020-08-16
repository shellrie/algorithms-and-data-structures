package org.shellrie.algsds.algorithms.sort;

public abstract class Sort<T> {
	public abstract void sort(Comparable<T>[] items);
	
	protected void swap(Comparable<T>[] items, int i, int j) {
		assert items != null;
		assert i >= 0 || i < items.length || j >= 0 || j < items.length;
		
		if(i == j) {
			return;
		}
		
		Comparable<T> temp = items[i];
		items[i] = items[j];
		items[j] = temp;
	}
}
