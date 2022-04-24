class Solution {
    public boolean isHappy(int n) {
        int res;
        // keep in set numbers we saw to determine if we are going in an endless cycle
        HashSet<Integer> h = new HashSet<Integer>();
        while (!h.contains(n))
        {
            h.add(n);
            res = 0;
            while (n > 0) {
                res += Math.pow(n%10, 2);
                n/=10;
            }
            if (res == 1)
                return true;
            n = res;
        }
        return false;
    }
}