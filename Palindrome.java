class Solution {
    public boolean isPalindrome(int x) {
		int digit = 0;
		int count = 0;
        int result = 0;
        int temp = x;
		while(x>0) {
			digit = x % 10;
			result = (result*10)+digit;
			x = x / 10;
		}
		if(temp == result) {
			return(true);
		}
		else {
			return(false);
		}
    }
}
