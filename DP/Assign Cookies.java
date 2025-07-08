class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
      return func(g, s, 0, 0);  
    }
    public int func(int[]g, int[]s, int i, int j){
        if(i >= g.length || j >= s.length) return 0;
        int inc=0, exc=0;
        if(s[j] >= g[i]){
            inc = 1+func(g, s, i+1,j+1);
        }else{
            exc = func(g, s, i, j+1);
        }
        return inc+exc;
    }
}
