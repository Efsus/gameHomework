package gameHomework.Entities;

import gameHomework.Abstract.IEntity;

public class Campaign implements IEntity{
	
	public int id;
	public double discountRatio;
	public String name;
	
	public Campaign(int id, String name, double discountRatio) {
		this.id = id;
		this.name = name;
		this.discountRatio = discountRatio;
		
	}

}
