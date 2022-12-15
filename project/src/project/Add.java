package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Add {
	
	ArrayList<String> yo_ = new ArrayList<>(Arrays.asList("월", "화", "수", "목", "금", "토", "일"));
	ArrayList<Integer> ru = new ArrayList<>(Arrays.asList(3,4,5));
	ArrayList<String> ru_ = new ArrayList<>(100);
	ArrayList<String> exer_ = new ArrayList<>(6);

	public void add() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("운동 추가 : ");
		
		for(int i = 0;i <= 6; i++) {
			String exer = scanner.next();
			exer_.add(exer);
		}
		
		int i=0;
		int j=+i;
		
		for(; i <= yo_.size()-1;i++,j++) {
			
				System.out.printf(yo_.get(i)+ " : ");
				System.out.printf(exer_.get(j)+ " | ");

				if(i == exer_.size()-1) {
						j=-1;
				}
		}
	}
}