package Game;

public class Champion { // 챔피언에 대한 객체
	static int hp;
	private int Damage;

	public Champion(int hp) {
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

	public void attack(Monster monster_1) {

		System.out.printf("*챔피언의 공격! %d의 데미지\n", Damage);
		monster_1.hp -= Damage;
		if (monster_1.getHp() <= 0) { // 체력이 0보다 낮아지면 0으로 만들어라
			monster_1.setHp(0);
		}
		System.out.printf("몬스터 체력 : %d\n", monster_1.getHp());
		System.out.println("==============================");
	}

}