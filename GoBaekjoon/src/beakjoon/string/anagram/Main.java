package beakjoon.string.anagram;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] first_str = bf.readLine().split("");
        String[] second_str = bf.readLine().split("");
        
        Queue<String> stack1 = new LinkedList<>();
        Stack<String> stack1_rm = new Stack<>();
        Queue<String> stack2 = new LinkedList<>();
        Stack<String> stack2_rm = new Stack<>();
        
        //who is large?
        if(first_str.length > second_str.length) {
        	for(String k : first_str) { stack1.offer(k); }
        	for(String m : second_str) { stack2.offer(m); }
        }else {
        	for(String k : second_str) { stack1.offer(k); }
        	for(String m : first_str) { stack2.offer(m); }
        }
        
        //몇 개의 단어를 빼야하는지 검증하자.
        //검증
        stack1.offer(stack1.poll());
        System.out.println(stack1.toString());

        while(stack1.size() > 0) {
        	if(stack1.peek() == stack2.peek()) {
        		
        	}
        }
		/*
		 * ArrayList<String> f_list = new ArrayList<>(Arrays.asList(first_str));
		 * ArrayList<String> s_list = new ArrayList<>(Arrays.asList(second_str));
		 * 
		 * Collections.sort(f_list); Collections.sort(s_list);
		 * 
		 * Set<String> f_set = new HashSet<String>(f_list); Set<String> s_set = new
		 * HashSet<String>(s_list);
		 * 
		 * int[] f_arr = new int[f_set.size()]; int[] s_arr = new int[s_set.size()];
		 * 
		 * for(int k = 0; k<f_set.size(); k++){ f_arr[k] = Collections.frequency();
		 * 
		 * }
		 */
    }
}
