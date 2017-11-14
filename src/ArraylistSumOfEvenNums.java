import java.util.ArrayList;

public class ArraylistSumOfEvenNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		System.out.println(evenCount(a));
	}
	public static int evenCount(int[] nums) {
	 ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++)
	    {
	       numsList.add(nums[i]);
	    }
	    
	    return evenCountB(numsList);

	}
	public static int evenCountB(ArrayList<Integer> numsList) 
	{   
		int sum=0;
		for(int i=0;i<numsList.size();i++) {
			if(numsList.get(i)%2==0) {
				sum +=numsList.get(i);
			}

	}
		return sum;
}
}
