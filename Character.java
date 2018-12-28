import java.util.ArrayList;
/**
 * @author Tucker Nielsen, Westley Grove
 * Last modified 12 / 20 / 2018
 */
public abstract class Character {

	//Details
	private String name;
	private ArrayList<Item> inventory;
	private Item[] equipped;
	private ArrayList[] abilities;
	
	//Stats
	private int strength;
	private int accuracy;
	private int magicMax;
	private int magicCurrent;
	private int defense;
	private int speed;
	private int healthMax;
	private int healthCurrent;
	private int staminaMax;
	private int staminaCurrent;
	
	Character(String name, int str, int acc, int mag, int def, int spd, int hp, int sta) {
		this.name = name;
		strength = str;
		accuracy = acc;
		magicMax = mag;
		magicCurrent = magicMax;
		defense = def;
		speed = spd;
		healthMax = hp;
		healthCurrent = healthMax;
		staminaMax = sta;
		staminaCurrent = staminaMax;
		equipped = new Item[5];
		abilities = new ArrayList[3];
		inventory = new ArrayList<Item>();
	}
	
	public abstract void useItem(int index);
	
	public ArrayList<Item> showInventory() {
		return inventory;
	}

	public ArrayList[] showAbilities() {
		return abilities;
	}
	
	public abstract void act();
}
