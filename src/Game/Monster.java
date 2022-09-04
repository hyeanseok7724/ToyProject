package Game;

public class Monster { // 몬스터에 대한 객체
	static int hp;
	private int Damage;

	public Monster(int hp) {
		super();
		this.hp = hp;
	}

	public int getDamage() {
		return Damage;
	}

	public void setDamage(int damage) {
		Damage = damage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void attack(Champion champion_1) {
		try {
		    Thread.sleep(1000);                 
		} catch(Exception e) {
            e.printStackTrace();
		}

		System.out.printf("\n-몬스터의 공격! %d의 데미지\n", Damage);
		champion_1.hp -= Damage;
		if (champion_1.getHp() <= 0) { // 체력이 0보다 낮아지면 0으로 만들어라
			champion_1.setHp(0);
		}
		System.out.printf("챔피언 체력 : %d\n\n", champion_1.getHp());

	}



}