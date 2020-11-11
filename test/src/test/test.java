package test;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int[] a = {2,3,1,1,4};
		System.out.println(check(a));
	}
	public static boolean check(int[] arr) {
		int last = arr.length-1;
		int step =0;
		int count =0;
		for(int i=0; i<arr.length; i++) {
			 step = arr[i];
			 if(step<last) {
				 count=arr[i];
				 i=count;
			 }
			 System.out.println(step);
		}
		if(step==last)
			return true;
		return false;
	}
}
