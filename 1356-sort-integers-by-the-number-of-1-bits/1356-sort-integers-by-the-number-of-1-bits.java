class Solution {
 public static int byteCount(int n){
        int count=0;
        while(n!=0){
            if(n%2==1)
                count++;
            n/=2;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
       Arrays.sort(arr);
        int max=-100;
        int res[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
            max=Math.max(max,byteCount(arr[i]));
        for(int i=0;i<=max;i++){
        for(int j=0;j<n;j++){
            if(byteCount(arr[j])==i)
                res[k++]=arr[j];
        }
        }
        return res;
    }
}