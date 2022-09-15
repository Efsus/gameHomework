package gameHomework.Abstract;

import gameHomework.Entities.Gamer;

public abstract class BaseGamerManager implements IGamerService {
	
	public void Register(Gamer gamer) {
		System.out.println(gamer.firstName + " has registered to system. ");
	}
	
	public void Update(Gamer gamer) {
		System.out.println(gamer.firstName + " has updated his informations.");
	}
	
	public void Remove(Gamer gamer) {
		System.out.println(gamer.firstName + " has removed from system.");
	}
	
		
}
