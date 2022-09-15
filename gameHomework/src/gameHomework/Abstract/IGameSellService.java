package gameHomework.Abstract;

import gameHomework.Entities.Campaign;
import gameHomework.Entities.Game;
import gameHomework.Entities.Gamer;

public interface IGameSellService {
	
	void Sell(Game game ,Gamer gamer);
	void SellWithCampaign(Game game, Gamer gamer ,Campaign campaign);

}
