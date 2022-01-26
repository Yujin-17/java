package Polymorphism_ex01;

public class Dog extends Animal{

	@Override // annotation 
	public void cry() {
		System.out.println("港港");
	}
	
	// 部府摹扁
	public void lash() {
		System.out.println("部府摹扁");
	}
}
