package java_array_programs;
import java.util.Arrays;
public class reverse_array {
	public static void reverse_array(StringBuffer[] arr){
		for(int i=0;i<arr.length;i++) {
			arr[i].reverse();
		}int i=0;
		int j=arr.length-1;
		while(i<j) {
			StringBuffer temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
			
		}System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		StringBuffer[] arr= { new StringBuffer("hello world"),new StringBuffer("java")};
		reverse_array(arr);
	}

}
