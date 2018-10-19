import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int B[]= {31,41,59,26,41,58};
		
		System.out.println("Original array: ");
		System.out.println(Arrays.toString(B));
		
		for(int i = 1 ;i < B.length;i++) {
			int insertItem = B[i];
			int j=i-1;
			while((j>=0)&&(B[j]>insertItem)) {
				B[j+1] = B[j];
				j--;
		
			}
			B[j+1] = insertItem;
		}
		System.out.println("Sorted array in ascending order: ");
		System.out.println(Arrays.toString(B));
		
		System.out.println("");
		
		////// Decreasing
		int [] A = {1,5,2};
		int curr_1,k;
		System.out.println("Original array: ");
		System.out.println(Arrays.toString(A));
		
		for(int i = 1 ;i < A.length;i++) {
			curr_1= A[i];
			k = i -1;
			while((k>=0)&&(A[k]<curr_1)) {
				A[k+1] = A[k];
				k--;
		
			}
			A[k+1] = curr_1;
		}
		System.out.println("Sorted array in descending order: ");
		System.out.println(Arrays.toString(A));
		
	}
}
