
import java.util.*;

class SuareRootOfElementDes {
	// Function to sort an square array
	public static void sortSquares(int arr[])
	{
		int n = arr.length;

		// First convert each array elements
		// into its square
		for (int i = 0; i < n; i++)
			arr[i] = arr[i] * arr[i];
		Arrays.sort(arr);
	}

	public static void main(String[] args)
	{
		int arr[] = { -6, -3, -1, 2, 4, 5 };
		int n = arr.length;

		System.out.println("Before sort ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		sortSquares(arr);
		System.out.println("");
		System.out.println("After Sort ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
