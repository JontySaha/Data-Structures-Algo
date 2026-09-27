package dsa;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,3,4,5,3};
		System.out.println(secondLargestElement(nums));

	}

	private static int secondLargestElement(int[] nums) {
		// TODO Auto-generated method stub
			int max=Integer.MIN_VALUE;
			for(int i=0;i<nums.length;i++) {
				if(max<nums[i]) {
					max=nums[i];
				}
			}
			int s_max=Integer.MIN_VALUE;
			for(int i=0;i<nums.length;i++) {
				if(s_max<nums[i] && nums[i]!=max) {
					s_max=nums[i];
				}
			}
			if(s_max==Integer.MIN_VALUE){
                return -1;
            }
            return s_max;
			
	}

}
