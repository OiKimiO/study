package 백준.브루트포스;

import java.io.*;
import java.util.*;

public class _15649_N과M {

	static boolean[] check;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		check = new boolean[N+1];
		arr   = new int[M+1];
		dfs(N,M,0);
		System.out.println(sb.toString());
	}

	private static void dfs(int n, int m, int depth) {
		
		if(depth == m) {
			for(int i = 0; i < arr.length-1; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(check[i]) continue;
			check[i] = true;
			arr[depth] = i;
			dfs(n,m,depth+1);
			check[i] = false;
		}
		
	}

}
