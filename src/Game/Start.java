package Game;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account(0);

		System.out.println("============== Gambble ==============");
		System.out.println("입장을 원하시면 '0'을 눌러주세요.");
		System.out.print(">>");

		while (true) {
			int choice = sc.nextInt();

			switch (choice) {
			// 입장
			case 0:
				System.out.println("입장합니다.");
				System.out.println("============== Gambble ==============");
	 			System.out.println(" \n 1.배팅시작\n 2.잔액 충전\n 3.잔액조회\n 4.퇴장\n");
				System.out.println("============== Gambble ==============");
				System.out.print(">> ");
				break;

			// 배팅 시작
			case 1:
				System.out.println("배팅을 시작합니다.");
				System.out.println("============== Gambble ==============");
				System.out.println("");
				Batting.batt();
				break;

			// 잔액충전
			case 2:
				System.out.print("잔액 충전 : ");
				ac.setInput(sc.nextInt());
				System.out.println("============== Gambble ==============");
				System.out.println(" \n 1.배팅시작\n 2.잔액 충전\n 3.잔액조회\n 4.퇴장\n");
				System.out.println("============== Gambble ==============");
				System.out.print(">> ");
				break;

			// 잔액조회
			case 3:
				ac.getBalance();
				System.out.println("============== Gambble ==============");
				System.out.println(" \n 1.배팅시작\n 2.잔액 충전\n 3.잔액조회\n 4.퇴장\n");
				System.out.println("============== Gambble ==============");
				System.out.print(">> ");
				break;

			// 게임 종료
			case 4:
				System.out.println("게임을 종료합니다.");
				System.exit(choice);
				break;

			default: // 1,2,3,4번 외의 숫자를 입력시 실행
				System.out.print("숫자를 다시 입력해주세요 >> ");
				break;
			}
		}
	}
}