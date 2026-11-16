package java_array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class two_sums {
	public static void two_sums(int[] arr) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					System.out.println("two numbers are"+ arr[i]+ " "+arr[j]);
					System.out.println("indexes are" + i + " " +j);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {2,3,5,4,3};
		System.out.println(Arrays.toString(arr));
		two_sums(arr);

	}

}
