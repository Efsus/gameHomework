package gameHomework.Concrete;

import gameHomework.Abstract.ICampaignService;
import gameHomework.Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.name +" named campaign added.");
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.name +" named campaign updated.");
		
	}

	@Override
	public void Remove(Campaign campaign) {
		System.out.println(campaign.name +" named campaign removed.");
		
	}
	
	

}
