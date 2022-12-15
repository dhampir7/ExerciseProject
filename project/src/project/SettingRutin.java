package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class SettingRutin {
	
	public void settingrutin() {
		
		System.out.println("=================셋팅 루틴 ==============");
		System.out.println("1. 운동 추가 | 2. 운동 삭제 | 3. 운동 조회");
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();
		switch(select) {
		case 1: new Add().add();
		break;
		case 2: new Delete().delete();
		break;
		case 3: new Join().join();
		break;
		}
	}
}

