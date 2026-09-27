package dsa;

public class MaximumConsecutiveOnes {
	
	public static int maxConOnes(int nums[]) {
		 int c=0;
	        int max=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==1){
	                c++;
	                max=Math.max(c,max);
	            }else{
	                c=0;
	            }
	        }
	        return max;
	}
	
	public static void main(String args[]) {
		int a[]= {1,1,0,1,1,1};
		System.out.println(maxConOnes(a));
	}
}
