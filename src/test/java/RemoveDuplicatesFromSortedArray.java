
public class RemoveDuplicatesFromSortedArray {
public static void main(String[] args) {
	//int[] arr= {1,1,2};
	int[] arr= {0,1,1,1,2,2,3,3,4};
	int result=removeDup(arr);
	System.out.println(result);
}
public static int removeDup(int[] nums) {
	int count=0;
	for(int i=0;i<nums.length;i++) {
		if(i<nums.length-1 && nums[i]==nums[i+1]) {
			continue;
		}
		else {
			nums[count]=nums[i];
			count++;
		}
	}
	return count;
}
}
