import java.util.*;

public class student {
	private String id;
	private String name;
	private int WebProgramming;
	private int OOP;
	private int DS;
	
	//constructor
	public student() {
		
	}
	public student(String id, String name, int WebProgramming, int OOP, int DS) {
		this.id = id;
		this.name=name;
		this.WebProgramming=WebProgramming;
		this.OOP=OOP;
		this.DS=DS;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getWebProgramming() {
		return WebProgramming;
	}

	public void setWebProgramming(int webProgramming) {
		WebProgramming = webProgramming;
	}

	public int getOOP() {
		return OOP;
	}

	public void setOOP(int oOP) {
		OOP = oOP;
	}

	public int getDS() {
		return DS;
	}

	public void setDS(int dS) {
		DS = dS;
	}
	
	
	
	

}
