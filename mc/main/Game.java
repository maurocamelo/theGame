package mc.main;

import java.util.List;
import mc.domain.Character;
import mc.domain.Weapon;
import mc.service.PlayService;
import mc.service.PlayServiceImpl;
import mc.service.SetUpService;

public class Game {

	public static void main(String[] args) throws Exception{
		
		PlayService playService = new PlayServiceImpl();
		SetUpService setUpService  = new PlayServiceImpl();
		
		List<Character> characters = setUpService.charactersList();
		List<Weapon> weapons =   setUpService.weaponsList();
		
		playService.startPlayPoint1(characters, weapons);
		
		playService.startPlayPoint2(characters, weapons);

	}

}
