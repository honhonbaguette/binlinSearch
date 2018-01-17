public class Search {
	public static void main(String[] args) {
	
		int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		int[] test2= {0,4,5,6,12,15,17,23,29};
		
		System.out.println(binSearch(test1,3)); //2
		System.out.println(linSearch(test1,3)); //2
		
		System.out.println(binSearch(test2,23)); //2
		System.out.println(linSearch(test2,23)); //2
		
		System.out.println(binSearch(test2,25)); //2
		System.out.println(linSearch(test2,25)); //2
		
		System.out.println(binSearch(test1,10)); //2
		System.out.println(linSearch(test1,1)); //2
		
		System.out.println(binSearch(test1,1)); //2
		
	}
	
	public static int linSearch(int[] nums, int position)
	{ 
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==position)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int binSearch(int[] nums, int position)
	{
		
		int l=0;
		int r=nums.length-1;
		while(l<=r)
		{
			int mid = l+(r-l)/2;
			if(nums[mid]==position)
			{
				return mid;
			}
		     if(nums[mid]<position)
			{
				l= mid+1;
			}
			if (nums[mid]>position)
			{
				r= mid-1;
			}
		}
		return -1;
	}
	
}
