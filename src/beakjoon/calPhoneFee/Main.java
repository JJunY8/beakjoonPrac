package beakjoon.calPhoneFee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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
		String[] temp = st2.split("\s");
		
		int call = Integer.parseInt(st1);
		int[] calllen = new int[call];
		for(int i = 0; i<call; i++) {
			calllen[i] = Integer.parseInt(temp[i]);
		}
		
		int minsik = 29; 
		int yongsik = 59;
		int[] mok = new int[call];
		int[] namuge = new int[call];
		int index = 0;
		
		for(int c : calllen) {
			namuge[index] = c % minsik;
			if(namuge[index]<c)
		}
		
	}
}
