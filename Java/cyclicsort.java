// Java program to implement cycle sort
import java.util.Arrays;
public class Cyclic_algo {
	  
		// Function sort the array using Cycle sort (range from 1 to n)
		static void sort(int[] arr) {
			int i=0;
			while(i<arr.length) {
				int correct=arr[i]-1;
				if(arr[i]!=arr[correct]) {
					swap(arr,i,correct);
				}
				else {
					i++;
				}
			}
		}
  
		// Function sort the array using Cycle sort (range from 1 to n)
		static void sorting(int[] arr) {
			int i=0;
			while(i<arr.length) {
				int correct=arr[i];
				if(arr[i]!=arr[correct]) {
					swap(arr,i,correct);
				}
				else {
					i++;
				}
			}
		}
  //swap function
		static void swap(int[] arr,int first,int second) {
			int temp=arr[first];
			arr[first]=arr[second];
			arr[second]=temp;
		}
  
 // Driver program to test above function
  public static void main(String[] args) {
    //range from 0 to n
		int[] arr= {3,4,2,1,5,0};
		sorting(arr);
		System.out.println(Arrays.toString(arr)+ "range from 0 to n");

     //range from 1 to n
		int[] ar= {3,4,2,1,5};
		sort(ar);
		System.out.println(Arrays.toString(ar)+ "range from 1 to n");
	
  }
}

//output:
//[0, 1, 2, 3, 4, 5]  range from 0 to n
//[1, 2, 3, 4, 5] range from 1 to n

