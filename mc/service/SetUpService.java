package mc.service;

import java.util.List;

import mc.domain.Weapon;
import mc.domain.Character;

public interface SetUpService {
	
	public List<Character> charactersList() throws Exception;
	
	public List<Weapon> weaponsList() throws Exception;

}
