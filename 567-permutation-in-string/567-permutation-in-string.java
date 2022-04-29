class Solution {
    public boolean checkInclusion(String s1, String s2) {
               int len1 = s1.length();
		int len2 = s2.length();
        if(len1>len2) return false;
		int i = 0, j = 0;
        
        //26이라는 숫자는 어디서? : 알파벳 숫자
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
        
		while (j < len1) {
			arr1[s1.charAt(j) - 'a']++;
			arr2[s2.charAt(j) - 'a']++;
			j++;
		}
		if(Arrays.equals(arr1,arr2))
			return true;
		while (j < len2) {
			arr2[s2.charAt(j) - 'a']++;
			arr2[s2.charAt(i) - 'a']--;
			i++;
			j++;
			if (Arrays.equals(arr1, arr2))
				return true;
		}
		return false;
    }
}