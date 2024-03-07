package beakjoon.smaller10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer nx = new StringTokenizer(bf.readLine());
		StringTokenizer ints = new StringTokenizer(bf.readLine());
		nx.nextToken();
		int k = Integer.parseInt(nx.nextToken());
		
		while(ints.hasMoreTokens()) {
			int j = Integer.parseInt(ints.nextToken());
			if(j < k) {System.out.print(j +" ");}
		}

	}

}
