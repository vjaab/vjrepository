package com.allcorp.policyservice;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.lang.ArrayUtils;

public class CumulativeFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[] { 5, 4, 2, 1, 3 };
		Integer[] sorted = ArrayUtils.toObject(data);
		Arrays.sort(sorted, new Comparator<Integer>() {
		    public int compare(Integer o1, Integer o2) {
		        // Intentional: Reverse order for this demo
		        return o1.compareTo(o2);
		    }
		});
		for (int i =0; i<sorted.length;i++){
			System.out.println(sorted[i]);
		}
	}

}
