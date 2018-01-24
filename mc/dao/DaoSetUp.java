package mc.dao;

import java.util.List;

import mc.domain.Character;
import mc.domain.Weapon;

public interface DaoSetUp {
	
	public List<Character> charactersListSetUp() throws Exception;
	
	public List<Weapon> weaponsListSetUp() throws Exception;

}
