package mc.service;

import java.util.List;

import mc.domain.Character;
import mc.domain.Weapon;

public interface PlayService extends SetUpService {
	
	public void startPlayPoint1(List<Character> characters, List<Weapon> weapons) throws Exception;
	
	public void startPlayPoint2(List<Character> characters, List<Weapon> weapons) throws Exception;

}
