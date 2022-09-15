package gameHomework.Entities;

import gameHomework.Abstract.*;

public class Game implements IEntity{
	public int id;
	public String name;
	public String category;
	public double price;
	
	public Game(int id, String name, String category, double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
}
