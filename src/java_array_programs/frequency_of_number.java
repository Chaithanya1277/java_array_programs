package java_array_programs;
import java.util.Arrays;
import java.util.Scanner;


public class frequency_of_number {

	
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int[] a=new int[5];
			
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<a.length;i++) {
				int count=1;
			
				if(a[i]==-1) {
					continue;
				}
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					a[j]=-1 ;
				}
			}
			
			System.out.println(a[i]+"occurs"+ count +"times");
			}
			}

	}
