/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    public int firstBadVersion(int n) {
        int mid;
        int left = 1;
        int right = n;
        int con = 0;
        
        while(left<=right){
            mid =left + (right - left)/2;
            if(isBadVersion(mid)){
                right = mid-1;
                //con = mid;
            }else{
                left = mid + 1;
            }
        }
        
        return left;
    }
    
}