/*
 * Raymond Luu
 * TCSS 343
 * 4/7/2014
 * Homework 1 Problem 6
 */
public class HW1_Problem6 {
	
	/**
	 * Main method
	 * 
	 * @param args console input.
	 */
	public static void main(String[] args) {
		// To hold all numbers. Modify to use other lists of numbers.
		int[] numbers = {4, 5, 1, 2, 8, 10};
		// Size of array. Modify according to the above array size.
		int array_size = 6;
		// To hold sum(K). Modify to find a different sum.
		int sum = 13;
		
		boolean valid = problem6(numbers, array_size, sum);
		
		System.out.println("This array has a pair (a,b,c) that sums up to the value K: " + valid);
	}
	
	/**
	 * Method to solve problem 6 in Homework 1
	 * 
	 * @param input array of numbers.
	 * @param K sum to look for with pair of numbers (a,b,c) in array.
	 * @return true if pair exists and false otherwise.
	 */
	public static boolean problem6(int []input, int size, int K)
	{
		int start_index = 1;
		int end_index = 2;
		int current_sum = 0;
		boolean valid = false;
		
		for (int i = 0; i <= size - 3; i++)
		{
			while(start_index != size - 1 || end_index != size)
			{
				current_sum = input[i] + input[start_index] + input[end_index];
				
				if (current_sum == K)
				{
					valid = true;
					end_index++;
				}
				else
				{
					end_index++;
				}
				if(end_index == size)
				{
					end_index = start_index + 2;
					start_index++;
				}
			}
			start_index = i + 2;
			end_index = start_index + 1;
		}
		return valid;
	}

}
