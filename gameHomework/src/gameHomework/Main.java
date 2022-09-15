package gameHomework;

import java.time.LocalDate;

import gameHomework.Abstract.BaseGamerManager;
import gameHomework.Abstract.IGameSellService;
import gameHomework.Abstract.IGamerCheckService;
import gameHomework.Concrete.CampaignManager;
import gameHomework.Concrete.GameSellManager;
import gameHomework.Concrete.GamerCheckManager;
import gameHomework.Concrete.GamerManager;
import gameHomework.Entities.Campaign;
import gameHomework.Entities.Game;
import gameHomework.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		IGamerCheckService checkManager = new GamerCheckManager();
		IGameSellService sellManager = new GameSellManager();
		
		
		Gamer gamer1 = new Gamer(1, "Yusuf", "Gökdoğan", LocalDate.of(2006, 7, 27), "11100027620");
		Game game1 = new Game(1, "The Last Of Us", "Action,Adventure", 60.00);
		Campaign campaign1 = new Campaign(3,"Summer Discounts", 50.0);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign1);
		
	
		
		BaseGamerManager gamerManager = new GamerManager(checkManager);
		gamerManager.Register(gamer1);
		
		sellManager.Sell(game1,gamer1);
		sellManager.SellWithCampaign(game1, gamer1, campaign1);
		
		
	}

}
