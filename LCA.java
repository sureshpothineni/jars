package dynamicprogram;

public class LCA {
	public static void main(String arg[]){
		String str ="abcdaf";
		String str1 = "acbcf";
		//String result = lcs(str, str);
		System.out.println(getLongestCommonSubstring(str, str1));
		//System.out.println(lca(str, str1, str.length(), str1.length()));
		
	}
	
	public static int lca(String str, String str1, int m, int n){
		
		if(str.charAt(m-1) == str1.charAt(n-1))
			return 1+ lca(str, str1, m-1, n-1);
		else
			return max(lca(str, str1, m, n-1), lca(str,str1, m-1, n));
	}
	
	public static int max(int a, int b) {
		return (a > b) ? a: b;
	}
	
	public static int getLongestCommonSubstring(String a, String b){
		int m = a.length();
		int n = b.length();
	 
		int max = 0;
	 
		int[][] dp = new int[m][n];
	 
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(a.charAt(i) == b.charAt(j)){
					if(i==0 || j==0){
						dp[i][j]=1;
						System.out.println(a.charAt(i));
					}else{
						dp[i][j] = dp[i-1][j-1]+1;
						System.out.println(a.charAt(i));
					}
	 
					if(max < dp[i][j])
						max = dp[i][j];
				}
	 
			}
		}
	 
		return max;
	}
	
	public static int lcSubstring(String str, String str1){
		
		int m = str.length();
		int n = str1.length();
		int T[][] = new int[m][n];
		
		int max =0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(str.charAt(i) == str1.charAt(j)){
					T[i][j] = T[i-1][j-1]+1;
				} else {
					T[i][j] = 0;
				}
				
				if(max < T[i][j])
					max = T[i][j];
			}
			
		}
		
		return max;
	}
	public static String lcs(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
 
        int[][] arr = new int[l1 + 1][l2 + 1];
        int len = 0, pos = -1;
 
        for (int x = 1; x < l1 + 1; x++)
        {
            for (int y = 1; y < l2 + 1; y++)
            {
                if (str1.charAt(x - 1) == str2.charAt(y - 1))
                {
                        arr[x][y] = arr[x - 1][y - 1] + 1;
                        if (arr[x][y] > len)
                        {
                            len = arr[x][y];
                            pos = x;
                        }               
                }
                else
                    arr[x][y] = 0;
            }
        }        
 
        return str1.substring(pos - len, pos);
    }
}
 