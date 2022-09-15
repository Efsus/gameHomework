package gameHomework.Concrete;

import gameHomework.Abstract.IGameSellService;
import gameHomework.Entities.Campaign;
import gameHomework.Entities.Game;
import gameHomework.Entities.Gamer;

public class GameSellManager implements IGameSellService{

	@Override
	public void Sell(Game game, Gamer gamer) {
		System.out.println(game.name + " named game has been sold to " + gamer.firstName + " for " + game.price + " dollars.");
		
	}

	@Override
	public void SellWithCampaign(Game game , Gamer gamer ,Campaign campaign) {
		
		double newPrice = game.price - (game.price * campaign.discountRatio/100);
		game.price = newPrice;
		System.out.println(game.name + " named game has been sold to " + gamer.firstName + " for " + game.price + " dollars because of " + campaign.name);
		
	}
	

}
