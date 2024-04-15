class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber= x;
        int reverseNumber;
        int digit = 0;
        while(x>0){
            reverseNumber = x % 10;
            digit = digit * 10 + reverseNumber;
            x = x/10;
        }
        if(originalNumber != digit){
            return false;
        }
        else{
            return true;
        }
    }
}
