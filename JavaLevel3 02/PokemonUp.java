package main;

import java.util.Random;

public class PokemonUp extends Pokemon{
	
	String 속성;
	Random rd = new Random();
	
	PokemonUp() {
		super();
		System.out.println("메가진화!");
		this.공격력 = 공격력 * 2;
		
		// 속성 부여(풀, 물, 불)
		int 예비속성 = rd.nextInt(3);
		if (예비속성 == 0) {
			속성 = "풀";
		} else if (예비속성 == 1) {
			속성 = "불";
		} else {
			속성 = "물";
		}
	}
	
	@Override
	void 능력치() {
		System.out.printf("이름: %s 체력: %d 공격력: %d 스피드: %d 속성 : %s \n", 이름, 체력, 공격력, 스피드, 속성);
	}
	
	@Override
	void 몸통박치기(Pokemon 적) {
		System.out.printf("%s가 %s의 몸통박치기를 사용했다!\n", 이름, 속성);
		적.체력 -= 공격력 + 20;
	}
	
	void 몸통박치기1(PokemonUp 적) {
		if ((속성 == "풀" && 적.속성 == "물")||(속성 == "물" && 적.속성 == "불")||(속성 == "불" && 적.속성 == "풀")) {
			System.out.printf("%s가 몸통박치기를 사용했다!\n", 이름);
			System.out.printf("효과는 굉장했다!");
			적.체력 -= 공격력 + 40;
			
		} else {
			System.out.printf("%s가 몸통박치기를 사용했다!\n", 이름);
			적.체력 -= 공격력 + 20;	
		}
		
	}
	
}
