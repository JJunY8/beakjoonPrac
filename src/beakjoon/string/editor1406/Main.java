package beakjoon.string.editor1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer st = new StringBuffer(bf.readLine());
		int cmd = Integer.parseInt(bf.readLine());
		int index = st.length();
		
		for(int i = 0; i<cmd; i++) {
			String command = bf.readLine();
			String[] commands = command.split(" ");
			switch(commands[0]) {
				case "L" :
					if(index > 0) {index--;}
					break;
				case "D" :
					if(index < st.length()) {index++;}
					break;
				case "B" :
					if(index == 0) {
						index = 0;
					}else {
						index--;
						st.deleteCharAt(index);
					}
					break;
				case "P" :
					st.insert(index, commands[1]);
					index++;
					break;
			}
		}
		
		bw.write(st.toString());

		bw.flush();
		bf.close();
	}

}
