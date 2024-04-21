class Solution {
    public int countDigits(int num) {
        int x = num;
        int count = 0;
        while (x != 0) {
            int a = x % 10;
            if (num % a == 0) {
                count++;
            }
            x = x / 10;
        }
        return count;
    }
}
