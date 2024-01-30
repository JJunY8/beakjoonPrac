package beakjoon.string.keyLogger.que;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		Queue<String> qstr = new LinkedList<String>(bf.readLine().split(null));
		
		int commandSize = Integer.parseInt(bf.readLine());
		for(int i = 0; i<commandSize; i++) {
			Queue<String> qstr = new LinkedList<String>(bf.readLine().split(bf.readLine()));
		}
	}
}
