package beakjoon;

import java.util.Arrays;



public class SevenDwarf {
	/*
	 * #2309번 일곱난쟁이
	 * 입력 : 아홉 개의 난쟁이 신장 값
	 * 출력 : 일곱 개의 난쟁이 신장 값(오름차순 정렬)
	 * 
	 * 조건 : 일곱 난쟁이 신장 값의 합이 100이 되어야 함.
	 * 
	 */
	final int SEVEN_DWARF_HEIGHTS_SUM = 100;
	
	int[] heights;
	
	public SevenDwarf(int[] heights) {
		this.heights = heights;
	}
	
	public void sort() {
		Arrays.sort(this.heights);
	}
	
	public void pickSeven() {
		
		int sum = 0;
		int cha;
		int findValue;
		int index;
		
		for(int i : heights) {
			sum += i;
		}
		
		cha = sum - SEVEN_DWARF_HEIGHTS_SUM;
		
		for(int i : heights) {
			findValue = cha-i;
			index = Arrays.binarySearch(heights, findValue);
			if(index < 0) {
				
			}else {
				
			}
			
		}
		
	}
}
