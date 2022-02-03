package models;

public class Hero {
	private int Id;
	private String alies;
	private String realName;
	private String power;
	private HeroType type;
	
	
	public Hero(int id, String alies, String realName, String power, HeroType type) {
		super();
		Id = id;
		this.alies = alies;
		this.realName = realName;
		this.power = power;
		this.type = type;
	}
	
	
	public Hero() {
		
	}

	public int getId() {
		return Id;
	}


	public String getAlies() {
		return alies;
	}


	public void setAlies(String alies) {
		this.alies = alies;
	}


	public String getRealName() {
		return realName;
	}


	public void setRealName(String realName) {
		this.realName = realName;
	}


	public String getPower() {
		return power;
	}


	public void setPower(String power) {
		this.power = power;
	}


	public HeroType getType() {
		return type;
	}


	public void setType(HeroType type) {
		this.type = type;
	}
	
	
}
