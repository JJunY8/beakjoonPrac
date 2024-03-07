package beakjoon.calPhoneFee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException  {
		//1. 영식 > 0~29초까지 10원(주기30)
		//2. 민식 > 0~59초마다 15원(주기60)
		//동호의 저번 달 요금에 근거한 더 저렴한 요금제 출력
		//입력1. 통화의 개수 (0<N<=20)
		//입력2. 통화 시간 N개(0<T<=10000)
		//출력1. Y(영식, 10원), M(민식, 15원)
		//출력2. 요금
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String st1 = bf.readLine();
		String st2 = bf.readLine();
		String[] temp = st2.split(" ");
		
		int call = Integer.parseInt(st1);
		int[] calllen = new int[call];
		for(int i = 0; i<call; i++) {
			calllen[i] = Integer.parseInt(temp[i]);
		}
		
		//나머지가 발생하면 금액을 +
		//금액은 몫 *
		
		int yongsikLen = 30;
		int minsikLen = 60; 
		int yongsikCost = 10;
		int minsikCost = 15;

		int mok;
		int namuge;
		long costY = 0;
		long costM = 0;
		
		for(int c : calllen) {
			mok = c/yongsikLen;
			namuge = c % yongsikLen;
		
			costY += yongsikCost * mok;
			
			if(namuge >= 0) {
				costY += yongsikCost;
			}
			
			mok = c/minsikLen;
			namuge = c % minsikLen;
		
			costM += minsikCost * mok;
			
			if(namuge >= 0) {
				costM += minsikCost;
			}
		}
		
		if(costY == costM) {
			System.out.println("Y M " + costY);
		}else if(costY > costM){
			System.out.println("M " + costM);
		}else {
			System.out.println("Y " + costY);
		}
	}
}
