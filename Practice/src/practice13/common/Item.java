package practice13.common;

public class Item {
	String name;
	int additionalDamage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAdditionalDamage() {
		return additionalDamage;
	}

	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	public Item(String name) {
		this.name = name;
	}

	public Item(String name, int i) {
		this.name = name;
		this.additionalDamage = getAdditionalDamage();
	}



}
