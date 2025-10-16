package loopConditionTaResult;

public class result2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3, 4, 5, 6, 7};
		int odd = 0;
		int even = 0;
		
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("홀수 " + odd + "개, 짝수 " + even + "개");
	}

}
