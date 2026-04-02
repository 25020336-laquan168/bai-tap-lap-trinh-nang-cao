public class Solution {
    public StringBuilder reverse(int n){
        String res = String.valueOf(n);
        StringBuilder ans = new StringBuilder("");
        if (res.startsWith("-")){
            res = res.substring(1);
        }

        ans.append("-");

        for (int i = res.length() - 1; i > -1; i--){
            ans.append(res.charAt(i));
        }
        return ans;
    }
}