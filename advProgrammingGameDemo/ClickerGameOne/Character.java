package ClickerGameOne;

public class Character {
	private String name; 
	private int atk; 
	private int speed; 
	private double money; 
	
	Character(String n, int a, int sp, double m){ 
		this.name = n;
		this.atk = a;
		this.speed = sp;
		this.money = m; 
	}
	
	public String getName( ) { 
		return this.name; 
	}
	
	public int getAtk( ) { 
		return this.atk; 
	}
	
	public int getspeed( ) { 
		return this.speed; 
	}
	
	public double getMoney() { 
		return this.money; 
	}
	
	public void setAtk(int a ) { 
		this.atk += a;  
	}
	
	public void setspeed(int s) { 
		this.speed +=s; 
	}
	
	public void addMoney(double m) { 
		this.money += m; 
	}
	
	public void subMoney(double m) { 
		this.money -= m; 
	}
	
	public String toString() { 
		return ("character name is " + this.name);
	}
	
	
	public void printStats() { 
		System.out.println("name: " + this.name);
		System.out.println("attack: "+ this.atk); 
		System.out.println("speed: " + this.speed);
		System.out.println("money: " + this.money); 
	}
}
