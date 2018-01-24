package mc.dao;

import java.util.ArrayList;
import java.util.List;

import mc.domain.Character;
import mc.domain.Weapon;

public class DaoSetUpImpl implements DaoSetUp {

	@Override
	public List<Character> charactersListSetUp() throws Exception {
		
		List<Character> charactersList = new ArrayList<Character>();
		
		charactersList.add(new Character(1, "Rick"));
		charactersList.add(new Character(2, "Michonne"));
		charactersList.add(new Character(3, "Negan"));
		charactersList.add(new Character(4, "Daryl"));
		
		return charactersList;
	}

	@Override
	public List<Weapon> weaponsListSetUp() throws Exception {
		
		List<Weapon> weaponsList = new ArrayList<Weapon>();
		
		weaponsList.add(new Weapon(1, "BaseballBat", "Shoot the revolver!"));
		weaponsList.add(new Weapon(2, "Bow-and-Arrow", "Shoot the revolver!"));
		weaponsList.add(new Weapon(3, "Revolver", "Shoot the revolver!"));
		weaponsList.add(new Weapon(4, "Katana", "Shoot the revolver!"));
		
		return weaponsList;
	}

}
