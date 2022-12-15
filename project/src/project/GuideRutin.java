package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class GuideRutin {
	
	public void guiderutin() {
		
		System.out.println("==========가이드 루틴 ==========");
		ArrayList<String> yo_ = new ArrayList<>(Arrays.asList("월", "화", "수", "목", "금", "토", "일"));
		ArrayList<Integer> ru = new ArrayList<>(Arrays.asList(3,4,5));
		ArrayList<String> ru3_ = new ArrayList<>(Arrays.asList("(가슴+삼두)","(등+이두)","(하체+어깨)","(가슴+삼두)","(등+이두)","(하체+어깨)"));
		ArrayList<String> ru4_ = new ArrayList<>(Arrays.asList("(등)","(가슴)","(하체)","(어깨)"));
		ArrayList<String> ru5_ = new ArrayList<>(Arrays.asList("(등)","(가슴)","(목)","(어깨)","(팔)"));
		ArrayList<String> ru_ = new ArrayList<>(100);
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("루틴 입력"+ru+ ": ");
		int rutin = scanner.nextInt();
		switch(rutin) {
		case 3: ru_ = ru3_;
		break;
		case 4: ru_ = ru4_;
		break;
		case 5: ru_ = ru5_;
		break;
		}
		
//		System.out.printf("휴식 시작요일 입력 :"+ (yo_) + ": "); 
//		String rest = scanner.next();
//		switch(rest) {
//		case "월": ru_.add(0, "(휴식)");
//			break;
//		case "화": ru_.add(1, "(휴식)");
//			break;
//		case "수": ru_.add(2, "(휴식)");
//			break;
//		case "목": ru_.add(3, "(휴식)");
//			break;
//		case "금": ru_.add(4, "(휴식)");
//			break;
//		} 
		
		int i=0;
		int j=+i;
		
		for(; i <= yo_.size()-1;i++,j++) {
			
				System.out.printf(yo_.get(i)+ " : ");
				System.out.printf(ru_.get(j)+ " | ");

				if(i == ru_.size()-1) {
						j=-1;
					}
				}
			
			}
		}

