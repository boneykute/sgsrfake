package com.sgs.game.sgsr.server.dto.staticdata;

public class DailyLoginReward extends BaseStaticDataDTO<DailyLoginReward> {
	private int packId;

	public DailyLoginReward() {
		super();
	}

	public DailyLoginReward(int id, String name, String description, int packId) {
		super(id, name, description);
		this.packId = packId;
	}

	public int getPackId() {
		return packId;
	}

	public void setPackId(int packId) {
		this.packId = packId;
	}

	@Override
	protected DailyLoginReward clone() {
		return new DailyLoginReward(id, name, description, packId);
	}
}
