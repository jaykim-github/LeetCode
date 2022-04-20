class Solution {
    public double average(int[] salary) {
        double sum = 0.00000;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<salary.length; i++){
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
            sum+=salary[i];
        }
        
        return (sum-max-min)/(salary.length-2);
    }
}