package beakjoon;

public class KtPlay {
	public int sum(int[] uut) {
		int result = 0;
		
		for(int i : uut) {
			result += i;
		}
		
		return result;
	}
	
	public void define(int result) {
		switch(result) {
		case 0 : 
			System.out.println('D');
			break;
		case 1 : 
			System.out.println('C');
			break;
		case 2 : 
			System.out.println('B');
			break;
		case 3 : 
			System.out.println('A');
			break;
		case 4 : 
			System.out.println('E');
			break;
		}
	}
}
