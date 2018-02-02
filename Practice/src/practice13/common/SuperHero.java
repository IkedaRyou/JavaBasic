package practice13.common;

public class SuperHero extends Hero {

	Item equipment = new Item();

	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
	public int attack() {
		return this.power+equipment.additionalDamage;
	}
}
