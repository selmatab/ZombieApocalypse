package sedmica6Cetvrtak;

public class Weapon {
	private String ime;	
	private double dmg;
	private double crit;
	private double ammo;
	
	public Weapon(String ime, double dmg, double crit, double ammo)
	{
		this.ime = ime;
		this.dmg = dmg;
		this.crit = crit;
		this.ammo = ammo;
	}
	
	public String getIme()
	{
		return ime;
	}
	
	public double getDmg()
	{
		return dmg;
	}
	
	public double getCrit()
	{
		return crit;
	}
	
	public double getAmmo()
	{
		return ammo;
	}
	
	public void setDmg(double dmg)
	{
		this.dmg = dmg;
	}
	
	public void setCrit(double crit)
	{
		this.dmg = crit;
	}
	
	public void setAmmo(double ammo)
	{
		this.ammo = ammo;
	}
	
	public void setIme(String ime)
	{
		this.ime = ime;
	}
	
	public boolean equals(Weapon weapon)
	{
		if (this.ime == weapon.ime && this.dmg == weapon.dmg && this.crit == weapon.crit && this.dmg == weapon.dmg)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return ime + ": dmg = " + dmg + ", crit = " + crit + ", ammo = " + ammo;
	}
	
}


