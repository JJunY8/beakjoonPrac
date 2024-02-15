package beakjoon.string.keyLogger;

import java.io.*;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int commandSize = Integer.parseInt(bf.readLine());

        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        while(commandSize > 0){
            String[] input =bf.readLine().split("");

            for(String k : input){
                if(k.equals(">")) {
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                }else if(k.equals("<")){
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                }else if(k.equals("-")) {
                    if(!left.isEmpty()){
                        left.pop();
                    }
                } else{
                    left.push(k);
                }
            }

            while(!left.isEmpty()){
                right.push(left.pop());
            }

            while(!right.isEmpty()){
                bw.write(right.pop());
            }
            commandSize--;
            bw.write('\n');
        }

        bf.close();
        bw.flush();
    }
}
