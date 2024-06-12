package main;

import java.util.Random;

public class Pokemon {

	private static int 마릿수 = 0;
	String 이름;
	int 체력;
	int 공격력;
	int 스피드;
	
	Random rd = new Random(); 
	
	int set마릿수() {
		return 마릿수;
	}
	
	Pokemon() {
		마릿수++;
		이름 = "포켓몬" + 마릿수;
		체력 = rd.nextInt(5, 11) * 10;
		공격력 = rd.nextInt(4, 7) * 5;
		스피드 = rd.nextInt(1, 21);
	}
	
	void 능력치() {
		System.out.printf("이름: %s 체력: %d 공격력: %d 스피드: %d \n", 이름, 체력, 공격력, 스피드);
	}
	
	void 몸통박치기(Pokemon 적) {
		System.out.printf("%s가 몸통박치기를 사용했다!\n", 이름);
		적.체력 -= 공격력;
	}

}
