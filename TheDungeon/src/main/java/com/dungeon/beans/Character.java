package com.dungeon.beans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Character {
	
	private Integer id;
	private String owner;
	private Integer level; 

	private String hair;
	
	//Equiped gear
	private String weapon;
	private String equipment;
	private String magic;
	private Set<String> accessories;
	private String pet;
	
	//Storage
	private String armory;
	private String wardrobe;
	private String spellbook;
	private String jewelbox;
	private String barn;
	
	
	public Character() {
		super();
		this.setId(0);
		this.setOwner("");
		this.setLevel(1);
		
		this.setHair("");
		
		this.setWeapon("");
		this.setEquipment("");
		this.setMagic("");
		this.setAccessories(new HashSet<String>());
		this.setPet("");
		
		
		this.setArmory("");
		this.setWardrobe("");
		this.setSpellbook("");
		this.setJewelbox("");
		this.setBarn("");
	}
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		if (id >= 0) {
			this.id = id;
		}
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		if (level > 0) {
			this.level = level;
		}
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public String getMagic() {
		return magic;
	}
	public void setMagic(String magic) {
		this.magic = magic;
	}
	public Set<String> getAccessories() {
		return accessories;
	}
	public void setAccessories(Set<String> accessories) {
		this.accessories = accessories;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	
	
	//ARMOR
	public String getArmory() {
		return armory;
	}
	public List<String> getArmoryList() {
		return convertHexToList(this.armory);
	}
	public void setArmory(String armory) {
		this.armory = armory;
	}
	
	//WARDROBE
	public String getWardrobe() {
		return wardrobe;
	}
	public List<String> getWardrobeList() {
		return convertHexToList(this.wardrobe);
	}
	public void setWardrobe(String wardrobe) {
		this.wardrobe = wardrobe;
	}
	
	//SPELLBOOK
	public String getSpellbook() {
		return spellbook;
	}
	public List<String> getSpellbookList() {
		return convertHexToList(this.spellbook);
	}
	public void setSpellbook(String spellbook) {
		this.spellbook = spellbook;
	}
	
	//JEWELBOX
	public String getJewelbox() {
		return jewelbox;
	}
	public List<String> getJewelboxList() {
		return convertHexToList(this.jewelbox);
	}
	public void setJewelbox(String jewelbox) {
		this.jewelbox = jewelbox;
	}
	
	//BARN
	public String getBarn() {
		return barn;
	}
	public List<String> getBarnList() {
		return convertHexToList(this.barn);
	}
	public void setBarn(String barn) {
		this.barn = barn;
	}
	
	
	
	public List<String> convertHexToList(String hex) {
		List<String> item = new ArrayList<String>();
		StringBuilder output = new StringBuilder();
		boolean fullName = false;
		for (int i = 0; i < hex.length(); i += 2) {
			String str = hex.substring(i, i + 2);
			char c = (char) Integer.parseInt(str, 16);
			if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_') {
				output.append(c);
				fullName = true;
			} else {
				if (fullName) {
					item.add(output.toString());
					output.setLength(0);
					fullName = false;
				}
			}
		}
		return item;
	}
	
	
}
