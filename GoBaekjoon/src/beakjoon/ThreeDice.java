package beakjoon;
import java.util.*;

public class ThreeDice {

	/*
	 * 입력 : 육면체 주사위 3개의 숫자 ex)3 3 6
	 * 출력 : 같은 눈의 개수에 따른 조건의 상금 금액
	 * 필요한 것
	 * 1. 같은 숫자 > 3개 중 2개를 뽑는 조합의 개수만큼 비교
	 * 2. 같은 숫자의 개수 > 더해볼까??
	 * 3. 가장 큰 수 > 같은 게 없을 경우에 구함
	 * 4. 최종 상금
	 */
	
	/*
	 * 자바에서 배열을 반복문에 사용하기 > 한 번 확인해보기
	 * for (int i : arr) {intHashSet1.add(i);}
	 */
	public int[] Dices(String inputString) {
		
		String[] st = inputString.split("\\s");
		int arrSize = st.length;
		
		int[] numbers = new int[arrSize];
		int index = 0;
		
		for(String i : st) {
			numbers[index] = Integer.parseInt(i);
			index += 1;
		}
		
		return numbers;
	}
	
	public int[] SetArray(int[] array) {
		
		int[] SetArr = Arrays.stream(array).distinct().toArray();
		
		return SetArr;
	}
	
	public int MatchPoint(int[] right, int[] left) {
		
		int rightSize = right.length;
		int leftSize = left.length;
		
		int matchPoint = rightSize - leftSize;
		
		return matchPoint;
	}
	
	public int MatchedNum(int[] right, int[] left) {
		
		int matchedNum = 0;
		int isMatch = 0;
		
		loop1 : 
		for(int i : left) {
			matchedNum = i;
			for(int k : right) {
				if(i==k) {
					isMatch += 1;
					if(isMatch > 1) {break loop1;}
				}
			}
		}
		
		return matchedNum;
	}
	
	public int Score(int number, int matchPoint) {
		
		int score = 0;
		
		switch(matchPoint) {
		case 0 :
			score = number * 100;
			break;
		case 1 :
			score = 1000 + (number * 100);
			break;
		case 2 :
			score = 10000 + (number * 1000);
		}
		
		
		return score;
	}
	
	public int BigNum(int[] arr) {
		
		int num;
		
		num = Arrays.stream(arr).max().getAsInt();
		
		return num;
	}
	
}
