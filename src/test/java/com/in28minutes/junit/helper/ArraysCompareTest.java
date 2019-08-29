package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomA() {
		int [] numbers = {12, 3, 4, 1};
		int [] expected = {1, 3, 4, 12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
		
	}
	
	/*
	@Test
	public void testArraySort_NullArray() {
		int [] numbers = null;
		try {
			Arrays.sort(numbers);
		}catch(NullPointerException e) {
			
		}
		Arrays.sort(numbers);
	}
	*/

	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		int [] numbers = null;
		
		Arrays.sort(numbers);
	}
	
	@Test(timeout=100)
	public void testSort_Performenace() {
		int array[] = {12, 23, 4};
		for(int i = 1; i<1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
		
	}
}
