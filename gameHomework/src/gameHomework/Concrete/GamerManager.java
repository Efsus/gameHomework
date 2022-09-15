package gameHomework.Concrete;

import gameHomework.Abstract.BaseGamerManager;
import gameHomework.Abstract.IGamerCheckService;
import gameHomework.Entities.Gamer;

public class GamerManager extends BaseGamerManager {
	
	private IGamerCheckService gamerCheckService;

	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	public void Register(Gamer gamer){
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			super.Register(gamer);
		}
		else {
			System.out.println("Not a valid person.");
		}
	}

}
