public class Solution {
    public boolean isPalindrome(int n){
        String res = String.valueOf(n);
        if (res.startsWith("-")){
            res = res.substring(1);
        }
        StringBuilder ans = new StringBuilder("");
        for (int i = res.length() - 1; i > -1; i--){
            ans.append(res.charAt(i));
        }
        return res.contentEquals(ans.toString());
    }
}
