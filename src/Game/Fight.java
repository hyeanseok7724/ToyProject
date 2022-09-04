package Game;

import java.util.Random;

public class Fight{


	public static void fight() {
		Champion champion_1 = new Champion(100);
		Monster monster_1 = new Monster(100);
		Random random = new Random();
		
		// 반복문 몬스터나 챔피언이 죽을 때 까지 계속실행된다.

		while (true) { 
			champion_1.setDamage(random.nextInt(11) + 5); // 데미지 범위 5~15
			monster_1.setDamage(random.nextInt(11) + 5);
			
			// 기존 체력이 0보다 낮으면 사망
			champion_1.attack(monster_1);
			if (monster_1.getHp() <= 0) {
				System.out.println("");
				System.out.println("몬스터가 죽었습니다. ");
				System.out.println("챔피언이 승리하였습니다.!!!!!!");
				break;
			}
			System.out.println();
			// 기존 체력이 0보다 낮으면 사망
			monster_1.attack(champion_1);
			if (champion_1.getHp() <= 0) {
				System.out.println("");
				System.out.println("챔피언이 죽었습니다.");
				System.out.println("몬스터가 승리하였습니다.!!!!!!");
				break;
			}
			
			
		}
	}
	
}