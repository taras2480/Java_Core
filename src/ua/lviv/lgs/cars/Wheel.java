package ua.lviv.lgs.cars;

public class Wheel {
	
	private double radius;
    private String season;
    private String type;
	public Wheel(double radius, String season, String type) {
		super();
		this.radius = radius;
		this.season = season;
		this.type = type;
	}
	
	public void changeSeason (String DesireSeason) {
		this.season=DesireSeason;
		
		}
	
	
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Wheel [radius=" + radius + ", season=" + season + ", type=" + type + "]";
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    
    
