import java.util.Scanner;

public class Card {
	
	public enum Rarity{
		COMMON, UNCOMMON, RARE, MYTHIC
	}
	public enum Type{
		LAND, CREATURE, INSTANT, SORCERY, ARTIFACT, ENCHANTMENT, PLANESWALKER, TOKEN, ARCANE, BATTLE, KINDRED
	}
	
	boolean isLegendary;
	Rarity my_rarity;
	Type my_type;
	
	Card(){
		
	}
	
	public String displayOverview(){
		String str = "hello";
		return str;
	}
	
	public String displayDetail() {
		String str = "hello";
		return str;
	}
	
	
	public void edit() {
		
	}
	
	
}
