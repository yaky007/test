package test;

public class ArraySortTest {

	public static void main(String[] args) {
		int [] nums={57,5,10,7,63,9};
		sort(nums,1);
		sort(nums,2);

	}
	private static void sort(int [] nums, int orderby){
		
		if(orderby==1){
			for(int i=0;i<nums.length-1;i++){
				for(int j=i+1;j<nums.length;j++){
					if(nums[i]>nums[j]){
						int tmp=nums[i];//tmp=57;
						nums[i]=nums[j];//nums[0]=5;
						nums[j]=tmp;//nums[1]=57;
					}
				}// for j
			}//for i
			for(int i=0;i<nums.length;i++){
				System.out.println("오름차순 : " + nums[i]+" ");
			}
		}//if
		else if(orderby==2){
			for(int i=0;i<nums.length-1;i++){
				for(int j=i+1;j<nums.length;j++){
					if(nums[i]<nums[j]){
						int tmp=nums[i];//tmp=57;
						nums[i]=nums[j];//nums[0]=5;
						nums[j]=tmp;//nums[1]=57;
					}
				}// for j
			}//for i
			for(int i=0;i<nums.length;i++){
				System.out.println("내림차순 : " + nums[i]+" ");
			}
		}
	}
}
