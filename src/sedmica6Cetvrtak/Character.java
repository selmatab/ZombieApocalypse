package sedmica6Cetvrtak;

public class Character {

	private String name;
	private double HP;
	private double dexterity;
	private Weapon weapon;
	private double strenght;
	private double speed;

	
	public Character(){
		setName(name);
		setHP(HP);
		setDexterity(dexterity);
		setWeapon(weapon);
		setStrenght(strenght);
		setSpeed(speed);
		
	}
	
	public Character(String name, double HP, double dexterity,Weapon weapon, double strength, double speed){
		setName(name);
		setHP(HP);
		setDexterity(dexterity);
		setWeapon(weapon);
		setStrenght(strenght);
		setSpeed(speed);
		
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public double getHP() {
		return HP;
	}
	
	public double getDexterity() {
		return dexterity;
	}
	
	public double getStrenght() {
		return strenght;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHP(double HP) {
		HP = HP;
	}
	
	public void setDexterity(double dexterity) {
		this.dexterity = dexterity;
	}
	
	public void setStrenght(double strenght) {
		this.strenght = strenght;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public String toString(){
		String out = "";
		out += "Name: " + this.name;
		out += "\nHP: " + this.HP;
		out += "\nDexterity: " + this.dexterity;
		out += "\nWeapon: " + this.weapon;
		out += "\nStrength: " + this.strenght;
		out += "\nSpeed: " + this.speed;
		return out;
	}
	

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		if (Double.doubleToLongBits(HP) != Double.doubleToLongBits(other.HP))
			return false;
		if (Double.doubleToLongBits(dexterity) != Double
				.doubleToLongBits(other.dexterity))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(speed) != Double
				.doubleToLongBits(other.speed))
			return false;
		if (Double.doubleToLongBits(strenght) != Double
				.doubleToLongBits(other.strenght))
			return false;
		if (weapon == null) {
			if (other.weapon != null)
				return false;
		} else if (!weapon.equals(other.weapon))
			return false;
		return true;
	}

	

	
}
