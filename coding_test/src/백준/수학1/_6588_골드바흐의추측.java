package 백준.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class _6588_골드바흐의추측 {

	public static void main(String[] args) throws IOException {
		int mn = 1000001;
		StringBuilder sb = new StringBuilder();
		boolean[] chk_prime  = new boolean[mn];
		ArrayList<Integer> list = new ArrayList<>();
		
		chk_prime[0] = chk_prime[1] = true;
		
		for(int i = 2; i < mn; i++) {
			if(!chk_prime[i]) {
				list.add(i);
				for(int j = i*2; j < mn; j+=i) {
					chk_prime[j] = true;
				}
			}
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int n = scan.nextInt();
			if(n == 0) break;
			for(int i = 0; i < list.size(); i++) {
				int min_prime = list.get(i);
				if(min_prime < n) {
					int max_prime = n-list.get(i);
					if(!chk_prime[max_prime]) {
						sb.append(n).append(" = ").append(min_prime).append(" + " + max_prime + "\n");
						break;
					}
				}
			}
		}
		
		System.out.print(sb.toString());
		
	}

}
