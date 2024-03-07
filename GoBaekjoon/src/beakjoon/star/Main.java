package beakjoon.star;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    int repeatLine = (2*num)-1;
	    
	    int a = -1;
	    int b = repeatLine;
	    int c = -1;
	    
	    for(int i=0; i<repeatLine; i++) {
	    	if(i<num) {
	    		System.out.print(" ".repeat(++a));
		    	System.out.println("*".repeat(b--));
		    	b--;
		    	if(b<1) {
		    		b += 3;
		    		a--;
		    	}
	    	}else {
	    		b++;
	    		System.out.print(" ".repeat(a--));
		    	System.out.println("*".repeat(b++));
	    	}
	    }
	    
	    sc.close();
	}
}