package mc.service;

import java.util.Collections;
import java.util.List;
import mc.dao.DaoSetUp;
import mc.dao.DaoSetUpImpl;
import mc.domain.Character;
import mc.domain.Weapon;

public class PlayServiceImpl implements PlayService {
	
	DaoSetUp daoSetUp = new DaoSetUpImpl();

	@Override
	public List<Character> charactersList() 
			throws Exception {
	
		return daoSetUp.charactersListSetUp();
	}

	@Override
	public List<Weapon> weaponsList() 
			throws Exception {
		
		return daoSetUp.weaponsListSetUp();
	}

	
	public void startPlayPoint1(List<Character> characters, List<Weapon> weapons)
			throws Exception {
		
		int x = 0;
		Collections.shuffle(weapons);
		
		for (int w = 0; w < weapons.size(); w++) {
			
			for (int c = 0; c < characters.size(); c++) {
			
				if(x == weapons.size())
					break;
				
				System.out.print(characters.get(c).getName() + " is using 1 weapon : " + weapons.get(x).getType() + "\n");
				
				x = c+1;
			}
			
		 }
     }
	
	public void startPlayPoint2(List<Character> characters, List<Weapon> weapons)
			throws Exception {
		
		String secondWeapon = "";
		int x = 0;
		Collections.shuffle(weapons);
		System.out.print("\n\n");
		
		for (int w = 0; w < weapons.size(); w++) {
			
			for (int c = 0; c < characters.size(); c++) {
			
				if(x == weapons.size())
					break;
				
				if(x == weapons.size() || x !=0){
					secondWeapon = weapons.get(x-1).getType();
				}else if(x ==0){
					secondWeapon = weapons.get(x+1).getType();	
				}
				
				System.out.print(characters.get(c).getName() + " is using 2 weapon : "
						+ weapons.get(x).getType() + 
						" and " +secondWeapon + 
						". The behaviour is : " + weapons.get(x).getBehaviour() + "\n");
				
				x = c+1;
			}
			
		 }
     }


}
