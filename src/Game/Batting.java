package Game;

import java.util.*;

public class Batting {

	public static void batt() {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		Start st = new Start();
		System.out.println("1.배팅 선택");
		System.out.println("2.배팅 종료");
		System.out.print(">>");


		double money = 0;// 배팅금액
		double profit = 0; // 배당금
		// 몬스터 , 챔피언 각자 랜덤 배당 할당
		double c = Math.round(ran.nextDouble(4) * 100) / 100.0; // 챔피온 배당 0.00 ~4.00배
		double m = Math.round(ran.nextDouble(4) * 100) / 100.0; // 몬스터 배당 0.00 ~ 4.00배

		while (true) {
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				// 배팅할 캐릭터 선택
				while (true) {
					System.out.println("============== Gambble ==============");
					System.out.println("");
					System.out.println("x" + c);
					System.out.println("1.챔피온");
					System.out.println();
					System.out.println("x" + m);
					System.out.println("2.몬스터");
					System.out.print("\n배팅할 캐릭터 번호 >> ");
					choice = sc.nextInt();

					if (!(choice == 1) && !(choice == 2)) {
						System.out.println("다시 입력해주세요");
						continue;
					}
					System.out.println(choice + "번을 선택");
					System.out.println("============== Gambble ==============");
					System.out.println("");
					break;
				}

				// 배팅 금액 입금
				while (true) {
					System.out.print("얼마를 배팅하겠습니까? >> ");
					money = sc.nextDouble();
					if (money > Account.balance) {
						System.out.println("잔액보다 배팅금액이 커서, 배팅이 불가능합니다.");
						continue;
					}else if(money == 0 ) {
						System.out.println("잔액 업어서, 배팅이 불가능합니다.");
						continue;
					}
					System.out.println(Math.round(money) + "원을 배팅");
					Account.balance -= money; // 계좌에서 배팅금 차감
					break;
				}
				System.out.println("");
				System.out.println("============== Gambble ==============");

				// y를 누르면 게임을 시작합니다.
				while (true) {
					System.out.println("");
					System.out.print("게임을 시작하시려면 'y'를 누르시오 >> ");
					String s = sc.next();
					char a = s.charAt(0);

					if (a == 'y') {
						Fight.fight();
					} else {
						System.out.println("다시 입력해 주세요 ");
						continue;
					}
					break;
				}

				// 선택한 캐릭터가 이긴다면 배당금 획득
				if (choice == 1) { // 챔피온 승리
					if (Champion.hp > Monster.hp) {
						System.out.println("");
						System.out.println("배팅금얙 : " + Math.round(money)); // 소수점 자릿수(.0) 제거
						profit = (money / 10) * c;
						System.out.println("배당금 : " + Math.round(profit)); // 소수점 자릿수(.0) 제거
						Account.balance += (money + profit);
					} else {
						System.out.println("돈을 잃었습니다..");
					}
				}
				if (choice == 2) { // 몬스터 승리
					if (Champion.hp < Monster.hp) {
						System.out.println("");
						System.out.println("배팅금얙 : " + Math.round(money));
						profit = (money / 10) * m;
						System.out.println("배당금 : " + Math.round(profit));
						Account.balance += (money + profit);
					} else {
						System.out.println("돈을 잃었습니다..");
					}
				}
				System.out.println("============== Gambble ==============");
				System.out.print("퇴장은 '2'를 누르시오 >> ");
				break;
				// 퇴장 후 Start Main클래스로 이동
			case 2:
				System.out.println("퇴장.");
				System.out.println("");
				Start.main(null);
				break;
				
				// 1,2번 외의 숫자를 입력시 실행
			default:
				System.out.print("숫자를 다시 입력해주세요 >> ");
				sc.nextInt();
				System.out.println("============== Gambble ==============");
				break;
			}
		}
		
	}
	
}
