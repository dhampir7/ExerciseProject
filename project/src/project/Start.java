package project;

import java.util.Scanner;

public class Start {
	
	public void start() {
		
		System.out.println("==========초기 설정==========");
		System.out.println("1. 가이드설정 루틴 | 2. 사용자설정 루틴");
		Scanner scanner = new Scanner(System.in);
		int Start = scanner.nextInt();
		switch(Start) {
		case 1: new GuideRutin().guiderutin();
		break;
		case 2: new SettingRutin().settingrutin();
		break;
		}
	}
}
