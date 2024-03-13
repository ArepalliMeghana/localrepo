import java.util.Arrays;

class Solution {
    public static String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        for(String i:v){
        System.out.println(i);}
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String args[])
    {
        String b[]={"flower","flow","flight"};
        String a=longestCommonPrefix(b);
        System.out.println(a);
    }
}