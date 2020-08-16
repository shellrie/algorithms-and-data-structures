package org.shellrie.algsds.algorithms.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public abstract class CommonSortTest {
	
	protected Sort<Integer> objectUnderTest;
	
	@Test
	public void sort_alreadySorted_noChange() {
		// setup
		Integer[] items = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		
		// test
		objectUnderTest.sort(items);
		
		// verify
		Integer[] expectedItems = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(expectedItems, items);
	}
	
	@Test
	public void sort_valuesBackward_sortsInOrder() {
		// setup
		Integer[] items = new Integer[] {10,9,8,7,6,5,4,3,2,1};
		
		// test
		objectUnderTest.sort(items);
		
		// verify
		Integer[] expectedItems = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(expectedItems, items);
	}
	
	@Test
	public void sort_allSameValue_noChange() {
		// setup
		Integer[] items = new Integer[] {9,9,9,9,9,9,9,9,9,9};
		
		// test
		objectUnderTest.sort(items);
		
		// verify
		Integer[] expectedItems = new Integer[] {9,9,9,9,9,9,9,9,9,9};
		assertArrayEquals(expectedItems, items);
	}
	
	@Test
	public void sort_oneItem_noChange() {
		// setup
		Integer[] items = new Integer[] {12};
		
		// test
		objectUnderTest.sort(items);
		
		// verify
		Integer[] expectedItems = new Integer[] {12};
		assertArrayEquals(expectedItems, items);
	}
	
	@Test
	public void sort_mixedValues_sortsInOrder() {
		// setup
		Integer[] items = new Integer[] {1,10,2,9,3,8,4,7,5,6};
		
		// test
		objectUnderTest.sort(items);
		
		// verify
		Integer[] expectedItems = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(expectedItems, items);
	}
}
