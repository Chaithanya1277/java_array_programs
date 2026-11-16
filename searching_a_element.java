package java_array_programs;

import java.util.Scanner;
import java.util.Arrays;

public class searching_a_element {
	public static String Searching_a_element(int[] arr) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				System.out.println("index value is" +i);
				return "found";
			}
		}return "not found";
	}

	public static void main(String[] args) {
		int[] arr= {12,45,32,23,78};
		System.out.println(Arrays.toString(arr));
		System.out.println(Searching_a_element(arr));

	}

}
