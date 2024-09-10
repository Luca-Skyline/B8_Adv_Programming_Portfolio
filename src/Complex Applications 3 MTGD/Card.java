import java.util.ArrayList;
import java.util.Scanner;

public class Card {
	
	public enum Rarity{
		LAND, COMMON, UNCOMMON, RARE, MYTHIC
	}
	public static enum Type{
		LAND, CREATURE, INSTANT, SORCERY, ARTIFACT, ENCHANTMENT, PLANESWALKER, TOKEN, ARCANE, BATTLE, KINDRED
	}
	
	public String name;
	int quantity;
	boolean isLegendary;
	Rarity my_rarity;
	public ArrayList<Type> my_type;
	
	public Card(String name, int quantity, ArrayList<Integer> types, int rarity, boolean isLegendary){
		this.name = name;
		this.quantity = quantity;
		
		my_type = new ArrayList<Type>();
		
		
		for(int type : types) {
			switch(type) {
			case 1:
				my_type.add(Type.LAND);
				break;
			case 2:
				my_type.add(Type.CREATURE);
				break;
			case 3:
				my_type.add(Type.INSTANT);
				break;
			case 4:
				my_type.add(Type.SORCERY);
				break;
			case 5:
				my_type.add(Type.ARTIFACT);
				break;
			case 6:
				my_type.add(Type.ENCHANTMENT);
				break;
			case 7:
				my_type.add(Type.PLANESWALKER);
				break;
			case 8:
				my_type.add(Type.TOKEN);
				break;
			case 9:
				my_type.add(Type.ARCANE);
				break;
			case 10:
				my_type.add(Type.BATTLE);
				break;
			case 11:
				my_type.add(Type.KINDRED);
				break;
			default:
				System.out.println("Congrats, you successfully broke my program :)");
			
			}
		}

		
		switch(rarity) {
			case 1:
				my_rarity = Rarity.LAND;
				break;
			case 2:
				my_rarity = Rarity.COMMON;
				break;
			case 3:
				my_rarity = Rarity.UNCOMMON;
				break;
			case 4:
				my_rarity = Rarity.RARE;
				break;
			case 5:
				my_rarity = Rarity.MYTHIC;
				break;
			default:
				System.out.println("Congrats, you successfully broke my program :)");
		}
		
		this.isLegendary = isLegendary;
		
	}
	
	public String displayDetails() {
		String str = name + " Details\nQuantity: " + quantity + "\nTypes: " + my_type + "\nRarity: " + my_rarity + "\nIs Legendary? " + isLegendary;
		return str;
	}
	
	
	public void edit(int new_quantity) {
		this.quantity = new_quantity;
	}
	
	
}
