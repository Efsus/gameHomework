package gameHomework.Concrete;

import gameHomework.Abstract.IGamerCheckService;
import gameHomework.Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		if(gamer.nationalityId.length() != 11 ) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	

}
