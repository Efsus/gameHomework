package gameHomework.Abstract;

import gameHomework.Entities.Gamer;

public interface IGamerService {
	
	void Register(Gamer gamer) throws Exception;
	void Update(Gamer gamer);
	void Remove(Gamer gamer);

}
